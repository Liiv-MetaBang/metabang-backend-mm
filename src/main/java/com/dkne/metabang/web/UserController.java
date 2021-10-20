package com.dkne.metabang.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dkne.metabang.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("v1")
public class UserController {

	private final UserService userService;
	
    @GetMapping("/user")
    public String hello() {
        return "user";
    }

}
