package com.itheima.mapper;

import com.itheima.domain.Categroy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class CategroyMapperTest {

    @Autowired
    CategroyMapper categroyMapper;
    @Test
    public void queryAllCategroy() {
        List<Categroy> categroys = categroyMapper.queryAllCategroy();
        System.out.println("categroys = " + categroys);
    }
}