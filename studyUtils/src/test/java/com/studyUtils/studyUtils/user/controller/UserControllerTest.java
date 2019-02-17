package com.studyUtils.studyUtils.user.controller;

import com.studyUtils.studyUtils.StudyUtilsApplication;
import com.studyUtils.studyUtils.user.entity.User;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @className:UserControllerTest
 * @author:zhangd
 * @date:2019/2/17
 * @description:TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= StudyUtilsApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getUserById() {
        ResponseEntity<User> forEntity = restTemplate.getForEntity("/user/1", User.class);
        Assert.assertThat(forEntity.getBody(), Matchers.notNullValue());
    }
}