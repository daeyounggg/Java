package org.koreait.exam;

import org.junit.jupiter.api.Test;
import org.koreait.entities.Member;
import org.koreait.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class JdbcEx1 {
    @Autowired
    private MemberRepository repository;

    @Test
    void test1(){
        List<Member> members = (List<Member>) repository.findAll();
        members.stream().forEach(System.out::println);
    }

    @Test
    void test2(){
        Member member = repository.findById(45L).orElse(null);
        System.out.println(member);

        member.setUserNm("(수정)사용자05");
        member.setModDt(LocalDateTime.now());
        repository.save(member);
    }

    @Test
    void test3(){
        //System.out.println(repository.getSequence());
        Member member = Member.builder()
                .userNo(repository.getSequence())
                .userId("user08")
                .userPw("123456")
                .userNm("사용자08")
                .email("user08@test.org")
                .mobile("01000000000")
                .regDt(LocalDateTime.now())
                .build();
        repository.save(member);
    }

    @Test
    void test4(){
        repository.deleteById(7L);
    }

    @Test
    void test5(){
        Member member = repository.findByUserId("user07");
        System.out.println(member);
    }

    @Test
    void test6(){
        LocalDateTime edate = LocalDateTime.now();
        LocalDateTime sdate = edate.minusDays(7);

        Pageable pageable = PageRequest.of(0,3);

        List<Member> members = repository.findByRegDtBetween(sdate, edate, pageable);
        members.stream().forEach(System.out::println);

    }

    @Test
    void test7(){
        List<Member> members = repository.findByUserNmContainingOrderByRegDtDesc("용");
        members.stream().forEach(System.out::println);
    }

    @Test
    void test8(){
        List<Member> members = repository.getMembers("%용%");
        members.stream().forEach(System.out::println);
    }
}