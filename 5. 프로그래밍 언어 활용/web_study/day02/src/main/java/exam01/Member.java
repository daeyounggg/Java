package exam01;

import lombok.*;

@Getter @Setter @ToString
//@NoArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PRIVATE) // 기본생성자
//@AllArgsConstructor
//@EqualsAndHashCode
//@RequiredArgsConstructor
@Data // @Getter @Setter @ToString @EqualsAndHashCode
public class Member {
    private String userId;

    //@ToString.Exclude
    //@NonNull
    private String userPw;
    private String userNm;

}