/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anuz.javabasedconfig.dao.impl;

import com.anuz.javabasedconfig.dao.UserDAO;
import com.anuz.javabasedconfig.entity.User;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author anuz
 */
@Repository
public class UserDAOImpl implements UserDAO {
    
    @Autowired
    SessionFactory sessionFactory;
    
    

    @Override
    public List<User> getAll() {
        Session session=sessionFactory.openSession();
        List<User> allUsers=session.createQuery("SELECT u from User u").list();
        session.close();
        return allUsers;

    }

    @Override
    public User getById(int id) {
       Session session=sessionFactory.openSession();
        User user=(User) session.createQuery("SELECT u FROM User u WHERE u.userId=:userId").setParameter("userId", id).uniqueResult();
        session.close();
        return user;
    }

    @Override
    public int saveOrUpdate(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
