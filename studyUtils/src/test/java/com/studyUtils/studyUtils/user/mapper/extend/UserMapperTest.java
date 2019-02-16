package com.studyUtils.studyUtils.user.mapper.extend;

import com.studyUtils.studyUtils.user.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @className:UserMapperTest
 * @author:zhangd
 * @date:2019/2/13
 * @description:TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void selectByPrimaryKey(){
        User user = userMapper.selectByPrimaryKey(1L);
        System.out.println(user.getNickname());
        Assert.assertNotNull(userMapper.selectByPrimaryKey(1L));
    }
}