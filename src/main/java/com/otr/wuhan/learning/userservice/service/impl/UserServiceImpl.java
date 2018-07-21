package com.otr.wuhan.learning.userservice.service.impl;

import com.otr.wuhan.learning.common.UserDTO;
import com.otr.wuhan.learning.userservice.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDTO getUserById(String id) {
        return UserDTO.buildDefaultUserWithId(id);
    }
}
