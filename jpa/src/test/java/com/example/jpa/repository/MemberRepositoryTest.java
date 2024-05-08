package com.example.jpa.repository;

import com.example.jpa.domain.entity.Member;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberRepositoryTest {
    @Autowired
    private MemberRepository memberRepository;

    @Test
    @Transactional
    void save(){
        Member member = new Member(null, "reeree");

        memberRepository.save(member);

        Assertions.assertEquals("reeree", member.getName());
        Assertions.assertNotNull(member.getId());
        System.out.println(member.getId());

    }

}