package com.bit.velog.controller;

import com.bit.velog.entity.Member;
import com.bit.velog.repository.CmntsRepository;
import com.bit.velog.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CmntsController {

    @Autowired
    CmntsRepository cmntsRepository;


}
