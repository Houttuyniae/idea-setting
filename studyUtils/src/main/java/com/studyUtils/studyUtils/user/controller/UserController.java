package com.studyUtils.studyUtils.user.controller;

import com.studyUtils.studyUtils.user.entity.User;
import com.studyUtils.studyUtils.user.mapper.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resources;

/**
 * @className:UserController
 * @author:zhangd
 * @date:2019/2/17
 * @description:TODO
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") String id){
        User user = userDao.selectByPrimaryKey(1L);
        return user;
    }
}
