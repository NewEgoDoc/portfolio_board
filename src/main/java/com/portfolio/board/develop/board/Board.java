package com.portfolio.board.develop.board;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import net.bytebuddy.asm.Advice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@RequiredArgsConstructor
public class Board {
    @Id @GeneratedValue()
    final private Long id;
    String title;
    String text;
    String writer;
    int hits;
    boolean delete_yn;
    LocalDateTime createdDate;
    LocalDateTime updatedDate;
}
