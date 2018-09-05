package com.otr.wuhan.learning.userservice.service;

import com.otr.wuhan.learning.userservice.client.GoodsClient;
import com.otr.wuhan.learning.userservice.dto.GoodsDTO;
import com.otr.wuhan.learning.userservice.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    GoodsClient goodsClient;

    public UserDTO getUserById(String id) {
        return UserDTO.buildDefaultUserWithId(id);
    }

    public GoodsDTO findGoodsById(String id) {
        return goodsClient.findGoodsById(id);
    }

    public List<GoodsDTO> findAllGoods(String action) {
        return goodsClient.findAllGoods(action);
    }
}
