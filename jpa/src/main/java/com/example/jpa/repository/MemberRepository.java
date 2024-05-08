package com.example.jpa.repository;

import com.example.jpa.domain.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface MemberRepository
extends JpaRepository<Member, UUID> {
    //앞에는 테이블, 엔티티 이름
    //뒤에는 사용할 아이디 타입
//    @Query("select m from Member where Member.deleted = false")


}
