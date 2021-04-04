package com.bit.velog.repository;

import com.bit.velog.entity.Cmnts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CmntsRepository extends JpaRepository<Cmnts,Integer> {

    List<Cmnts> findByNum(int num);
    @Query("delete from Cmnts C where C.board.num =:num ")
    void deleteByNum(int num);
    void deleteByCnum(int cnum); //게시판 삭제 시 댓글 삭제



}
