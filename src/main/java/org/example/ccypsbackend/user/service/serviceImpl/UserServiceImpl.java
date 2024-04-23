package org.example.ccypsbackend.user.service.serviceImpl;

import jakarta.annotation.Resource;
import jakarta.annotation.Resources;
import org.example.ccypsbackend.user.dao.entity.User;
import org.example.ccypsbackend.user.dao.repo.UserRepository;
import org.example.ccypsbackend.user.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    /* initialize the UserRepository */
    @Resource
    private UserRepository userRepository;

    /* login if the uname and password match */
    @Override
    public User login(String uname, String password) {
        User user = userRepository.findByUnameAndPassword(uname, password);
        if (user != null) {
            user.setPassword(""); // protect sensitive information
        }
        return user;
    }

    @Override
    public User register(User user) {
        if(userRepository.findByUname(user.getUname()) != null) {
            return null;
        }
        User newUser = userRepository.save(user);
        newUser.setPassword(""); // protect sensitive information
        return newUser;
    }
}
