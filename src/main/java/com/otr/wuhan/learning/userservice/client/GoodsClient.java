package com.otr.wuhan.learning.userservice.client;

import com.otr.wuhan.learning.userservice.dto.GoodsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "mst-goods-service")
public interface GoodsClient {
    @GetMapping("/goods")
    List<GoodsDTO> findAllGoods(@RequestParam(value = "action", required = false) String action);

    @GetMapping("/goods/{id}")
    GoodsDTO findGoodsById(@PathVariable("id") String id);
}