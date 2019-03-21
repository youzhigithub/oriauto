package com.ori.oriauto.user.api;

import com.ori.oriauto.user.api.hystrix.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "USER-SERVICE-PROVIDER" ,fallback = UserServiceHystrix.class)
public interface UserServiceApi {

    @RequestMapping(value = "/userTest")
    String userTest();
}
