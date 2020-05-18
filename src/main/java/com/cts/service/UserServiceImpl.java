package com.cts.service;

import com.cts.dao.UserDAO;
import com.cts.model.User;
import org.hibernate.Session;

import javax.transaction.Transactional;
import java.util.List;

public class UserServiceImpl implements UserService{

    private UserDAO userDAO;

    @Override
    @Transactional
    public List<User> listUsers() {
       return this.userDAO.listUsers() ;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        this.userDAO.addUser(user);
    }

    @Override
    @Transactional
    public User getUserById(int id) throws Exception {
        return this.userDAO.getUserById(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        this.userDAO.updateUser(user);
    }

    @Override
    @Transactional
    public User removeUser(int id) {
        return this.userDAO.removeUser(id);
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}