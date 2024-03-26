package com.thread.login.service;

import com.thread.login.dto.UserDto;
import com.thread.login.model.User;
import com.thread.login.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User save(UserDto userDto) {
        User user = new User(userDto.getFullName(), userDto.getUsername(), userDto.getDob(), userDto.getAddress(), userDto.getAvatar(), userDto.getPassword());
        return userRepository.save(user);
    }
}
