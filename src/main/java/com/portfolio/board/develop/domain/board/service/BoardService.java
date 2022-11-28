package com.portfolio.board.develop.domain.board.service;

import com.portfolio.board.develop.domain.board.service.dto.*;

import java.util.List;

public interface BoardService {
    /* 게시물 등록 */
    void registerBoard(RegisterBoardCommand command);

    /* 게시물 수정 */
    void updateBoard(UpdateBoardCommand command);

    /* 게시물 삭제 */
    void removeBoard(long writerId, long bookmarkId);

    /* 게시물 상세 조회 */
    GetDetailedBoardResult getDetailedBoard(long profileId, long boardId);

    /* 게시물 paging 조회 */
    /* 게시물 전체 조회 */
    List<GetBoardResult> getBoardList(BoardFindCond boardFindCond);
}
