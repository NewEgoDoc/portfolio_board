package com.portfolio.board.develop.domain.board.service;

import com.portfolio.board.develop.domain.board.Board;
import com.portfolio.board.develop.domain.board.persistence.BoardRepository;
import com.portfolio.board.develop.domain.board.service.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Transactional//(readOnly= true)
@Service
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Override
    public void registerBoard(RegisterBoardCommand command) {
//        boardRepository.save(new Board());
    }

    @Override
    public void updateBoard(UpdateBoardCommand command) {
        //find board

        //update board
    }

    @Override
    public void removeBoard(long writerId, long bookmarkId) {
        //find board

        //update board
    }

    @Override
    public GetDetailedBoardResult getDetailedBoard(long profileId, long boardId) {
        return null;
    }

    @Override
    public List<GetBoardResult> getBoardList(BoardFindCond boardFindCond) {
        return null;
    }

    @Override
    public void deleteBoard(UpdateBoardCommand command) {

    }
}
