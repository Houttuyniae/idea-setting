package com.studyUtils.studyUtils.common.utils.cache;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @className:JedisUtilTest
 * @author:zhangd
 * @date:2019/2/5
 * @description:TODO
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class JedisUtilTest {

    @Test
    public void expire() {
        String value = JedisUtil.Strings.get("123");
        Assert.assertEquals("123", value);
    }
}





