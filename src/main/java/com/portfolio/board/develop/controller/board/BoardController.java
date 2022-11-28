package com.portfolio.board.develop.controller.board;

import com.portfolio.board.develop.domain.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/api/v1/boards")
@RestController
public class BoardController {

    private final BoardService boardService;

    @GetMapping
    void getBoards(){

    }

    @PostMapping
    void registerBoard(){

    }

    @PutMapping //or PatchMapping
    void updateBoardById(){

    }

    @DeleteMapping
    void deleting(){

    }
}
