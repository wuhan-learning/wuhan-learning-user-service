package com.otr.wuhan.learning.userservice.service;


import com.otr.wuhan.learning.common.UserDTO;
import com.otr.wuhan.learning.userservice.dto.GoodDTO;

import java.util.List;

public interface UserService {
    UserDTO getUserById(String id);

    List<GoodDTO> findAllGood();
}
