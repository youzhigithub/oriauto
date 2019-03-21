package com.ori.oriauto.user.rpc;

import com.ori.oriauto.user.api.UserServiceApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRpc implements UserServiceApi {

    @Override
    public String userTest() {
        return "userTest";
    }
}
