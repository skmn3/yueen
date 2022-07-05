package kr.co.sunget.yueen.global.entity;


import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @CreatedDate
    private final ZonedDateTime createdAt = ZonedDateTime.now();

    @LastModifiedDate
    private final ZonedDateTime modifiedAt = ZonedDateTime.now();
}
