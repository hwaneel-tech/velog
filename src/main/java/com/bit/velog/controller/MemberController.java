package com.bit.velog.controller;

import com.bit.velog.entity.Member;
import com.bit.velog.repository.MemberRepository;
import com.bit.velog.service.BoardService;
import com.bit.velog.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MemberController {

    @Autowired
    MemberRepository memberRepository;

    private  BoardService boardService;
    private MemberService memberService;
    @GetMapping("join") // 회원 추가
    public String join(Member member){
        memberRepository.save(member);
    return "/";
    }

    @GetMapping("/delete/{id}")
    public String deleteMember(@PathVariable String id,
                         RedirectAttributes attributes,
                         Model model) {
        if (memberService.deleteMember(id)) {

            attributes.addFlashAttribute("message", "delete success");
            return "redirect:/board/login"; //또는 다른 곳으로 예정
        } else {
            model.addAttribute("message", "delete fail");
            return "redirect:/board/list"; //또는 다른 곳으로 예정
        }
    }



}
