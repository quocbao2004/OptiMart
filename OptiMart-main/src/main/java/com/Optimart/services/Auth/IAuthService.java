package com.Optimart.services.Auth;

import com.Optimart.dto.Auth.ChangePassword;
import com.Optimart.dto.Auth.ChangeUserInfo;
import com.Optimart.dto.Auth.UserRegisterDTO;
import com.Optimart.models.User;
import com.Optimart.responses.Auth.UserLoginResponse;

public interface IAuthService {
    User createUser(UserRegisterDTO userRegisterDTO) throws Exception;
    String login(String email, String password) throws Exception;
    User findUserByEmail(String email) throws  Exception;
    String changeUserPassword(ChangePassword changePassword, String token) throws Exception;
    UserLoginResponse changeUserInfo(ChangeUserInfo changeUserInfo);
}
