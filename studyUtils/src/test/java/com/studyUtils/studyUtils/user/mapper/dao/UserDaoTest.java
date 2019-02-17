package com.studyUtils.studyUtils.user.mapper.dao;

import com.studyUtils.studyUtils.user.entity.User;
import com.studyUtils.studyUtils.user.mapper.extend.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @className:UserDaoTest
 * @author:zhangd
 * @date:2019/2/16
 * @description:TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    UserDao userDao;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void selectByPrimaryKey(){
        User user = userDao.selectByPrimaryKey(1L);
        System.out.println(user.getNickname());
        Assert.assertNotNull(userDao.selectByPrimaryKey(1L));
    }

    @Test
    public void testSqlSession(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        sqlSession.
    }

}