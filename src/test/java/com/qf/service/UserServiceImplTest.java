package com.qf.service;

import com.qf.pojo.UserInfo;
import com.qf.tools.Page;
import com.qf.vo.UserInfoVo;
import com.qf.vo.UserVo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserServiceImplTest {

    ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml","spring-entity.xml");
    UserInfoService userInfoService = context.getBean(UserInfoService.class);
    UserInfo userInfo = context.getBean("hs", UserInfo.class);
    UserInfo xm = context.getBean("xm", UserInfo.class);

    @Test
    public void add(){
        Integer integer = userInfoService.addObject(userInfo);
        System.out.println(integer);
    }
    @Test
    public void update(){
        Integer integer = userInfoService.updateObject(xm);
        System.out.println(integer);
    }
    @Test
    public void delete(){
        Integer integer = userInfoService.deleteObject(2);
        System.out.println(integer);
    }
    @Test
    public void findAll(){
        List<UserInfo> all = userInfoService.findAll();
        System.out.println(all);
    }
    @Test
    public void getList(){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("index",1);
        map.put("pageSize",2);
        List<UserInfo> list = userInfoService.getList(map);
        System.out.println(list);
    }
    @Test
    public void getTotalCount(){
        Integer totalCount = userInfoService.getTotalCount();
        System.out.println(totalCount);
    }
    @Test
    public void getObjectById(){
        UserInfo objectById = userInfoService.getObjectById(3);
        System.out.println(objectById);
    }

    @Test
    public void getCount(){
        UserInfoVo userInfoVo = new UserInfoVo();
        Integer count = userInfoService.getCount(userInfoVo);
        System.out.println(count);
    }
    @Test
    public void getUserInfosPageBy(){
        UserInfoVo userInfoVo = new UserInfoVo();
        userInfoVo.setName("123");
        userInfoVo.setEmail("123");
        userInfoVo.setUsername("123");
        Page page = new Page();
        page.setCurrentPage(1);
        page.setPageSize(2);
        System.out.println(page);
        userInfoVo.setPage(page);
        List<UserInfo> userInfos = userInfoService.getUserInfosPageBy(userInfoVo);
        System.out.println(userInfos);
    }


}
