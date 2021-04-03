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
@Table(name = "board")
public class Board {
    @Id
    private int num;

    @Column
    private String writer;

    @Column
    private String title;

    @Column
    private String contents;

    @Column
    private byte image;

    @Column(name = "regdate")
    @CreationTimestamp
    private Timestamp regDate;

    @Column(name = "editdate")
    @UpdateTimestamp
    private Timestamp editDate;

    @Column(name = "readcount")
    private int readCount;

    @Column
    private int thumbs;

    @Column(name = "istemp")
    private int isTemp;

    @Column(name = "myrownum")
    private int myRowNum;
}
