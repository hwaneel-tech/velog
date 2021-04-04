package com.bit.velog.service;

import com.bit.velog.entity.Cmnts;
import com.bit.velog.repository.CmntsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CmntsService {

    @Autowired
    private CmntsRepository cmntsRepository;
    private BoardService boardService;

    public CmntsService(CmntsRepository cmntsRepository, BoardService boardService) {
        this.cmntsRepository = cmntsRepository;
        this.boardService = boardService;
    }

    public Cmnts getCmnts(int cnum) {
        return cmntsRepository.findById(cnum).get();
    }


    public boolean deleteComment(int cnum) {

        Cmnts cmnts = getCmnts(cnum);
        if (cmnts.getContents() != null) {
            cmntsRepository.deleteByCnum(cnum);
            return true;
        }

        return false;
    }

}
