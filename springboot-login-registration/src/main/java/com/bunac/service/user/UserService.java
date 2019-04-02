package com.bunac.service.user;


import com.bunac.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
