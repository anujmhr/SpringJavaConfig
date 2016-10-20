/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anuz.javabasedconfig.dao;

import com.anuz.javabasedconfig.entity.User;

import java.util.List;
/**
 *
 * @author anuz
 */
public interface UserDAO {
    
    List<User> getAll();
    User getById(int id);
    int saveOrUpdate(User user);
    int delete(int userId);
}
