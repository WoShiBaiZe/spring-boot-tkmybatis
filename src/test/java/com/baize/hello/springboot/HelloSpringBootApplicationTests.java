package com.baize.hello.springboot;

import com.baize.hello.springboot.domain.TbUser;
import com.baize.hello.springboot.mapper.TbUserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
//新增事务
@Transactional
//数据回滚
@Rollback
public class HelloSpringBootApplicationTests {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Test
    public void contextLoads() {
        System.out.println("Hello Spring Boot");
    }

    @Test
    public void testSelectAl(){
        List<TbUser> tbUsers = tbUserMapper.selectAll();
        tbUsers.forEach(tbUser-> {
            System.out.println(tbUser);
        });
    }

    @Test
    public void testInsert(){
        TbUser tbUser = new TbUser();
        tbUser.setUsername("baize");
        tbUser.setPassword("123456");
        tbUser.setPhone("15222222");
        tbUser.setEmail("2583929195@qq.com");
        tbUser.setCreated(new Date());
        tbUser.setUpdated(new Date());

        tbUserMapper.insert(tbUser);
    }

    @Test
    public void testUpdate(){
        TbUser tbUser = tbUserMapper.selectByPrimaryKey(37L);
        tbUser.setUsername("Happy");

        tbUserMapper.updateByPrimaryKey(tbUser);
    }

    @Test
    public void testDelete(){
        tbUserMapper.deleteByPrimaryKey(37L);
    }

    @Test
    public void testPage(){
        PageHelper.startPage(1,10);
        PageInfo<TbUser> pageInfo = new PageInfo<>(tbUserMapper.selectAll());
        System.out.println(pageInfo);
        System.out.println(pageInfo.getTotal());
        System.out.println(pageInfo.getPageNum());
        pageInfo.getList().forEach(tbUser -> {
            System.out.println(tbUser);
        });
    }

}
