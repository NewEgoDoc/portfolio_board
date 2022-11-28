package com.portfolio.board.develop.domain.board.persistence;

import com.portfolio.board.develop.domain.board.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {


}
