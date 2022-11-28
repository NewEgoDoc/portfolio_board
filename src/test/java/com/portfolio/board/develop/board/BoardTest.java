package com.portfolio.board.develop.board;

import com.portfolio.board.develop.domain.board.Board;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BoardTest {

    @Test
    void 게시판_생성_성공() {
        //given
        String title = "게시판 타이틀";
        String text = "오랜만에 만드는 게시판입니다 앞으로 자주 올릴게요";
        String writer = "변주한";
        int hits = 0;
        boolean delete_yn = false;

        //when
        Board board = new Board(title, text, writer, hits, delete_yn);

        //then
        Assertions.assertThat(board)
                .extracting(
                        Board::getTitle,
                        Board::getText,
                        Board::getWriter,
                        Board::getHits,
                        Board::isDelete_yn
                ).containsExactly(title,text,writer,hits,delete_yn);

        assertThat(board)
                .extracting(Board::getCreatedDate, Board::getUpdatedDate)
                .doesNotContainNull();
    }

    @Test
    void 게시판_생성_실패() {
    }
}