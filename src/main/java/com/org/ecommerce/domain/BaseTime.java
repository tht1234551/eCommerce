package com.org.ecommerce.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseTime {

    @CreatedDate
    @Column(name = "createdDate", updatable = false, nullable = true)
    private LocalDateTime createDate;

    @CreatedBy
    @Column(name = "creator")
    private Long creator;

    @LastModifiedDate
    @Column(name = "modifiedDate", nullable = true)
    private LocalDateTime modifiedDate;

    @LastModifiedBy
    @Column(name = "modifier")
    private String modifier;

}
