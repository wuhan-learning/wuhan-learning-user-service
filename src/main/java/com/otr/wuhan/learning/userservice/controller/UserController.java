package com.otr.wuhan.learning.userservice.controller;

import com.otr.wuhan.learning.userservice.dto.GoodsDTO;
import com.otr.wuhan.learning.userservice.dto.UserDTO;
import com.otr.wuhan.learning.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable("id") String id) {
        return userService.getUserById(id);
    }

    @GetMapping("/goods/{id}")
    public GoodsDTO findGoodsById(@PathVariable("id") String id) {
        log.info("<<<<<< find goods {}", id);
        return userService.findGoodsById(id);
    }

    @GetMapping("/goods")
    public List<GoodsDTO> findAllGoods(@RequestParam(value = "action", required = false) String action) {
        log.info("<<<<<< find all goods");
        return userService.findAllGoods(action);
    }
}
