package com.thread.login.service;

import com.thread.login.dto.UserDto;
import com.thread.login.model.User;

public interface UserService {
    User save(UserDto userDto);
}
