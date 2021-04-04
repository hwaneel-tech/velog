package com.bit.velog.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
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

    @Builder
    public Board(int num, String writer, String title, String contents, byte image, int readCount
    ,int thumbs,  int isTemp, int myRowNum) {
        this.num = num;
        this.writer = writer;
        this.title = title;
        this.contents = contents;
        this.image = image;
        this.readCount = readCount;
        this.thumbs = thumbs;
        this.isTemp = isTemp;
        this.myRowNum = myRowNum;
    }
}
