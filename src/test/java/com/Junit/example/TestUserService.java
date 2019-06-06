package com.Junit.example;

import com.junitClass.example.UserService;
import org.junit.jupiter.api.*;


public class TestUserService {

    private UserService userService = null;
    @BeforeEach
    public void init (){
        userService = new UserService();
    }

    @Test
    public void LogOutSuccess(){
        long userId = 1L;
        Assertions.assertTrue(userService.logOut(userId));
    }
    @Test
    public void resetPasswordExistingUser(){
        long userId = 2L;
        Assertions.assertTrue(userService.resetPassword(userId));

    }
    @Test
    public void resetPasswordBotExistingUser(){
        long userId = 5L;
        Assertions.assertFalse(userService.resetPassword(userId));
    }
    @Nested
    @DisplayName("TestCse for login")
    class LoginFeature{
        @Test
        void  loginUserNameCorrect() throws IllegalAccessException{
            boolean actual = userService.login("admin", "password123");
            Assertions.assertTrue(actual);
        }

    }
}
