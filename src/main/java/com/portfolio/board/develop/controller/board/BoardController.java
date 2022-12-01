package com.portfolio.board.develop.controller.board;

import com.portfolio.board.develop.domain.board.service.BoardService;
import com.portfolio.board.develop.domain.board.service.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/boards")
@RestController
public class BoardController {

    private final BoardService boardService;

    @GetMapping
    List<GetBoardResult> getBoards(){
        return boardService.getBoardList(new BoardFindCond());
    }

    @GetMapping("/{boardId}")
    GetDetailedBoardResult getBoardById(
            final @PathVariable long boardId
    ){
        return boardService.getDetailedBoard(1L,boardId);
    }

    @PostMapping
    void registerBoard(){
        boardService.registerBoard(new RegisterBoardCommand());
    }

    @PutMapping //or PatchMapping
    void updateBoardById(){
        boardService.updateBoard(new UpdateBoardCommand());
    }

    @DeleteMapping
    void deleteBoard(){
        boardService.deleteBoard(new UpdateBoardCommand());
    }
}
