package com.thread.login.controller;

import com.thread.login.dto.UserDto;
import com.thread.login.model.User;
import com.thread.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    String Login() {
        return "login";
    }

    @GetMapping("/register")
    public String getRegisterForm(@ModelAttribute("user") UserDto userDto) {
        return "registerForm";
    }
    @PostMapping("/register")
    public String saveUser(@ModelAttribute("user") UserDto userDto, Model model) {
        userService.save(userDto);
        model.addAttribute("message","Registered Successfully !");
        return "registerForm";
    }
    @GetMapping("")
    public String homepage() {
        return "homepage";
    }
}

