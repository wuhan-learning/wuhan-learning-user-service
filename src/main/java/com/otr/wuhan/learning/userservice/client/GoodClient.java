package com.otr.wuhan.learning.userservice.client;

import com.otr.wuhan.learning.userservice.dto.GoodDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "mst-goods-service")
public interface GoodClient {
    @RequestMapping(method = RequestMethod.GET,value = "/goods")
    List<GoodDTO> findAllGood();
}
