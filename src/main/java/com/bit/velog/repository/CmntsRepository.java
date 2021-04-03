package com.bit.velog.repository;

import com.bit.velog.entity.Cmnts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmntsRepository extends JpaRepository<Cmnts,Integer> {
}
