package com.bit.velog.controller;

import com.bit.velog.dto.BoardDto;
import com.bit.velog.entity.Member;
import com.bit.velog.repository.BoardRepository;
import com.bit.velog.repository.MemberRepository;
import com.bit.velog.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/board")
@Log4j2
@RequiredArgsConstructor //자동 주입을 위한 Annotation
public class BoardController {

    private final BoardService boardService;

    @Autowired
    BoardRepository boardRepository;

    @GetMapping("/")
    public String index() {

        return "redirect:/board/list";
    }

    @GetMapping("/")
    public String list(Model model) {
        List<BoardDto> boardDtoList = boardService.getBoardList();
        model.addAttribute("postList", boardDtoList);
        return "board/list.html";
    }



    @DeleteMapping("/board/list/{num}")
    public String delete(int num, RedirectAttributes redirectAttributes){


        log.info("num: " + num);

        boardService.delete(num);

        redirectAttributes.addFlashAttribute("msg", num); // msg에 num 값 입력하여 보여주기

        return "redirect:/board/list";

        /*
        * 안될 시
        * public int delete("/board/list/{num}"
        * boardService.delete(num);
        * return num;*/

    }



}
