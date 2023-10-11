package tests;

import jakarta.servlet.http.HttpServletRequest;
import models.member.BadRequestException;
import models.member.LoginService;
import models.member.RequestLogin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@DisplayName("로그인 기능 테스트")
@ExtendWith(MockitoExtension.class)
public class LoginServiceTest {
    private LoginService service;

    @Mock
    private HttpServletRequest request;
    private RequestLogin requestLogin;

    private void updateRequestData(String userId, String userPw){
        given(request.getParameter("userId")).willReturn(userId);
        given(request.getParameter("userPw")).willReturn(userPw);
    }


    @BeforeEach
    void init(){
        service = new LoginService();
        // request = mock(HttpServletRequest.class);
        requestLogin = RequestLogin.builder()
                .userId("user" + System.currentTimeMillis())
                .userPw("12345678")
                .build();
    }

    @Test
    @DisplayName("로그인 성공시 예외가 발생하지 않음")
    void loginSuccess(){
        assertDoesNotThrow(() -> {
            updateRequestData(requestLogin.getUserId(), requestLogin.getUserPw());
            service.login(request);
        });
    }

    @Test
    @DisplayName("필수 항목 검증(userId, userPw), 검증 실패시 BadRequestException 발생")
    void requiredFields(){
        assertThrows(BadRequestException.class, () -> {
            updateRequestData("  ", requestLogin.getUserPw());
            service.login(request);
        });
    }
}
