package com.cts.dao;

import com.cts.Exception.UserNotFoundException;
import com.cts.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class UserDAOImpl implements UserDAO {

    private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> listUsers() {
        Session session = sessionFactory.getCurrentSession();
        List<User> users = session.createQuery("from User").list();
        logger.info("All users loaded " + users);
        return users;
    }

    @Override
    public void addUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);
        logger.info("User saved successfully, User Details="+user);
    }

    @Override
    public User getUserById(int id) throws Exception {
        Session session = sessionFactory.getCurrentSession();
        User user = session.get(User.class, new Integer(id));
        if(user == null) {
            throw new UserNotFoundException("No existing Record found for user ");
        }
        logger.info("User found successfully "+id);
        return user;
    }

    @Override
    public void updateUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
        logger.info("User updated successfully, User details="+user);
    }

    @Override
    public User removeUser(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        User user = session.get(User.class, new Integer(id));
        if(user == null) {
            throw new UserNotFoundException("No existing Record found for user ");
        } else {
            session.delete(user);
        }
        logger.info("User deleted successfully, User details="+user);
        return user;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}