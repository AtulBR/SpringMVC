package com.cts.dao;

import com.cts.Exception.UserNotFoundException;
import com.cts.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> listUsers();
    public void addUser(User user);
    public User getUserById(int id) throws Exception;
    public void updateUser(User user);
    public User removeUser(int id);
}
