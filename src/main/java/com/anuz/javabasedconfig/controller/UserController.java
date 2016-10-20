/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anuz.javabasedconfig.controller;

import com.anuz.javabasedconfig.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author anuz
 */

@RestController
@RequestMapping(value = "/")
public class UserController {
    @Autowired
    UserService userService;
    
    @RequestMapping(value="/test",method = RequestMethod.GET)
    public ModelMap index(){
       ModelMap map=new ModelMap();
       map.addAttribute("hello", "world");
       return map;
    }
    
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public ModelAndView indexPage(){
       ModelAndView map=new ModelAndView("index");
       map.addObject("hello", "world");
       return map;
    }
       @RequestMapping(value="/allUsers",method = RequestMethod.GET)
    public ModelMap allUsers(){
       ModelMap map=new ModelMap();
       map.addAttribute("allUsers", userService.getAll());
       return map;
    }
    
}
