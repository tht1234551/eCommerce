package com.org.ecommerce.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no")
    private Long no;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private String age;

    @Column(name = "phone")
    private String phone;

    @Column(updatable = false, name = "regdate")
    @Temporal(TemporalType.DATE)
    private Date regdate;

    @Column(name = "modifydate")
    @Temporal(TemporalType.DATE)
    private Date modifydate;

//    @Column(name = "modifier")
//    private String modifier;


}
