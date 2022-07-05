package kr.co.sunget.yueen.global.error.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.co.sunget.yueen.global.error.ErrorResponse;
import kr.co.sunget.yueen.global.error.GlobalErrorCode;
import kr.co.sunget.yueen.global.error.exception.YueenException;
import kr.co.sunget.yueen.global.property.error.ErrorProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RequiredArgsConstructor
public class GlobalErrorFilter extends OncePerRequestFilter {

    private final ObjectMapper objectMapper;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws IOException {

        try {
            filterChain.doFilter(request, response);
        } catch (YueenException e) {
            setErrorResponse(e.getErrorProperties(), response);
        } catch (Exception e) {
            if (e.getCause() instanceof YueenException) {
                setErrorResponse(((YueenException) e.getCause()).getErrorProperties(), response);
            } else {
                setErrorResponse(GlobalErrorCode.INTERNAL_SERVER_ERROR, response);
            }
        }
    }


    private void setErrorResponse(ErrorProperties errorProperties, HttpServletResponse response) throws IOException {
        response.setStatus(errorProperties.getStatus());
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.getWriter().write(
                objectMapper.writeValueAsString(
                        new ErrorResponse(errorProperties)
                )
        );
    }
}
