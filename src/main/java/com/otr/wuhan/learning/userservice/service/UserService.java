package com.otr.wuhan.learning.userservice.service;


import com.otr.wuhan.learning.userservice.dto.GoodDTO;
import com.otr.wuhan.learning.userservice.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO getUserById(String id);

    List<GoodDTO> findAllGood();
}
