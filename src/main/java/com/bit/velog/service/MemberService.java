package com.bit.velog.service;

import com.bit.velog.entity.Member;
import com.bit.velog.repository.MemberRepository;
import org.springframework.stereotype.Service;


@Service
public class MemberService {

    private MemberRepository memberRepository;


    public boolean deleteMember(String id) {

        memberRepository.deleteById(id);

        if (id != null) {
            memberRepository.deleteById(id);
            return true;
        }

        return false;

    }
}

     /*Member member =
        if (member != null) {
            memberRepository.deleteById(id);
            return true;
        }

        return false;
    }*/