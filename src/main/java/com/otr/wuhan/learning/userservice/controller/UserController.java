package com.otr.wuhan.learning.userservice.controller;

import com.otr.wuhan.learning.common.UserDTO;
import com.otr.wuhan.learning.userservice.dto.GoodDTO;
import com.otr.wuhan.learning.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable("id") String id) {
        return userService.getUserById(id);
    }

    @GetMapping("/goods")
    public List<GoodDTO> getUserById() {
        return userService.findAllGood();
    }
}
