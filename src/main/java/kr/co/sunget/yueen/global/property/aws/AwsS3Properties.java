package kr.co.sunget.yueen.global.property.aws;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Getter
@ConstructorBinding
@ConfigurationProperties(prefix = "aws.s3")
public class AwsS3Properties {

    private final String url;
    private final String bucket;
    private final String profileFolder;
    private final String feedFolder;

    public AwsS3Properties(String url, String bucket, String profileFolder, String feedFolder) {
        this.url = url;
        this.bucket = bucket;
        this.profileFolder = profileFolder;
        this.feedFolder = feedFolder;
    }
}
