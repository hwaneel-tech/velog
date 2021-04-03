package com.bit.velog.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "cmnts")
public class Cmnts {
    @Id
    private int cnum;

    @Column
    private int bnum;

    @Column
    private String writer;

    @Column
    private String contents;

    @Column(name = "regdate")
    @CreationTimestamp
    private Timestamp regDate;

    @Column(name = "editdate")
    @UpdateTimestamp
    private Timestamp editDate;
}
