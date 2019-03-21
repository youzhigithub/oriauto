package com.ori.oriauto.user.api.hystrix;

import com.ori.oriauto.user.api.UserServiceApi;
import org.springframework.stereotype.Component;

@Component
public class UserServiceHystrix implements UserServiceApi {
    @Override
    public String userTest() {
        return "user Hystrix!";
    }
}
