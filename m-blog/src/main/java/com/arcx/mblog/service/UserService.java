package com.arcx.mblog.service;

import com.arcx.mblog.po.User;

public interface UserService {

    User checkUser(String username,String password);
}
