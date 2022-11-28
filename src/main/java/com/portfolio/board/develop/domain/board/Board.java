package com.portfolio.board.develop.domain.board;

import com.portfolio.board.develop.BaseIdEntity;
import com.portfolio.board.develop.exception.Preconditions;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "board")
@Entity
public class Board extends BaseIdEntity {

    @Column(nullable = true, length = 500)
    String title;

    @Column(nullable = true)
    @Lob
    String text;

    @Column
    String writer;
    int hits;
    boolean delete_yn;

    @Column(nullable = false)
    LocalDateTime createdDate;

    @Column(nullable = false)
    LocalDateTime updatedDate;

    public Board(String title, String text, String writer, int hits, boolean delete_yn) {
        Preconditions.checkNotNull(title);
        Preconditions.checkNotNull(writer);

        this.title = title;
        this.text = text;
        this.writer = writer;
        this.hits = hits;
        this.delete_yn = delete_yn;
        this.createdDate = LocalDateTime.now();
        this.updatedDate = LocalDateTime.now();
    }
}


