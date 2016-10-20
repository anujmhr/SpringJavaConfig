/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anuz.javabasedconfig.service;

import com.anuz.javabasedconfig.dao.UserDAO;
import com.anuz.javabasedconfig.entity.User;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author anuz
 */
@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public UserService() {
    }
    
    public List<User> getAll(){
        return userDAO.getAll();
    }
    
    
}
