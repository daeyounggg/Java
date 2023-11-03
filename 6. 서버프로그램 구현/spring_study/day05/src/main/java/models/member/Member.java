package models.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Builder @Data
@RequiredArgsConstructor @AllArgsConstructor
public class Member {
    private long userNo;
    private String userId;
    private String userPw;
    private String userNm;
    private String email;
    private String mobile;
    private LocalDateTime regDt; // 가입일시
    private LocalDateTime modDt; // 수정일시
}
