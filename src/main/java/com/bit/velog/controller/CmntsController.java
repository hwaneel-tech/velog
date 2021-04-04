package com.bit.velog.controller;

import com.bit.velog.repository.CmntsRepository;
import com.bit.velog.service.CmntsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CmntsController {


    @Autowired
    private CmntsService cmntsService;

    @GetMapping("/delete/{cnum}/board/{num}")
    public String deleteComment(RedirectAttributes attributes,
                                @PathVariable int cnum,
                                @PathVariable int num) {
        String msg;
        if (cmntsService.deleteComment(cnum)) {
            msg = "delete comment success";
        } else {
            msg = "delete comment fail";
        }
        attributes.addFlashAttribute("msg", msg);
        return "redirect:/board/list/" + num;
    }

}
