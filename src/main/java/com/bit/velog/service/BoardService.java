package com.bit.velog.service;

import com.bit.velog.dto.BoardDto;
import com.bit.velog.entity.Board;
import com.bit.velog.repository.BoardRepository;
import com.bit.velog.repository.CmntsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService {
    private BoardRepository boardRepository;
    private  CmntsRepository cmntsRepository;


    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

/*    @Transactional
    public int create(BoardDto boardDto) {
        return boardRepository.save(boardDto.toEntity()).getId();
    }*/

    @Transactional
    public List<BoardDto> getBoardList() {
        List<Board> boardList = boardRepository.findAll();
        List<BoardDto> boardDtoList = new ArrayList<>();

        for(Board board : boardList) {
            BoardDto boardDto = BoardDto.builder()
                    .num(board.getNum())
                    .writer(board.getWriter())
                    .title(board.getTitle())
                    .contents(board.getContents())
                    .thumbs(board.getThumbs())

                    .build();
            boardDtoList.add(boardDto);
        }
        return boardDtoList;
    }



    @Transactional
    public void delete(int num) {

        cmntsRepository.deleteByNum(num); //댓글 부터 삭제

        boardRepository.deleteById(num);





    }
}

