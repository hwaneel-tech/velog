package com.bit.velog.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "member")
public class Member {
    @Id
    private String id;

    @Column
    private String pw;

    @Column(name = "nickname")
    private String nickName;

    @Column
    private String email;

    @Column
    private byte photo;

    @Column(name = "regdate")
    @CreationTimestamp
    private Timestamp regDate;

    @Column(name = "editdate")
    @UpdateTimestamp
    private Timestamp editDate;
}
