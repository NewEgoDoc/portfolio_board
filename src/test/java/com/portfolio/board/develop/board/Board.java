package com.portfolio.board.develop.board;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class Board {

    @Test
    void 게시판_생성_성공() {
        //given
        String title = "나의 게게게게게시판";
        String text = "내용내용 내용내용";
        String writer = "juhan juhan byeon juhan";
        int hits = 0;
        boolean delete_yn = false;
        LocalDateTime createdDate = LocalDateTime.now();
        LocalDateTime updatedDate = null;
        //when

        Board board = new Board();

        //then
    }
}