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
    @Column(updatable = false, nullable = true)
    private LocalDateTime createdDate;

    @CreatedBy
    @Column
    private String creator;

    @LastModifiedDate
    @Column(nullable = true)
    private LocalDateTime modifiedDate;

    @LastModifiedBy
    @Column
    private String modifier;

}
