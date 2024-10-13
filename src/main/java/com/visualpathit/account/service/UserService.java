package com.visualpathit.account.service;

import java.util.List;

import com.visualpathit.account.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);

    User findById(long id);

    public List<User> getList();
}
