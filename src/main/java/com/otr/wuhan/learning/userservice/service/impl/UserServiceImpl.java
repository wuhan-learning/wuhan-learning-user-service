package com.otr.wuhan.learning.userservice.service.impl;

import com.otr.wuhan.learning.common.UserDTO;
import com.otr.wuhan.learning.userservice.client.GoodClient;
import com.otr.wuhan.learning.userservice.dto.GoodDTO;
import com.otr.wuhan.learning.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    GoodClient goodClient;

    @Override
    public UserDTO getUserById(String id) {
        return UserDTO.buildDefaultUserWithId(id);
    }

    @Override
    public List<GoodDTO> findAllGood() {
        return goodClient.findAllGood();
    }
}
