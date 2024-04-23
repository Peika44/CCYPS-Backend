package org.example.ccypsbackend.user.service;

import org.example.ccypsbackend.user.dao.entity.User;

public interface UserService {
    /* input uname and password, return the user if
    the uname and password match,
    otherwise return null */
    User login(String uname, String password);

    /* input a user, return the user if the user is
    successfully registered, otherwise return null
     */
    User register(User user);
}
