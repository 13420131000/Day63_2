package com.qf.service;


import com.qf.pojo.Role;

import com.qf.vo.UserVo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RoleServiceImplTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml","spring-aop.xml");
    RoleService roleService = context.getBean(RoleService.class);

    @Test
    public void add(){
        Role role = new Role();
        role.setRolename("程序员");
        Integer integer = roleService.addObject(role);
        /*System.out.println(integer);*/
    }
    @Test
    public void update(){
        Role role = new Role();
        role.setRoleid(3);
        role.setRolename("程序员");
        Integer integer = roleService.updateObject(role);
        System.out.println(integer);
    }
    @Test
    public void delete(){
        Integer integer = roleService.deleteObject(3);
        System.out.println(integer);
    }
    @Test
    public void findAll(){
        List<Role> all = roleService.findAll();
        System.out.println(all);
    }
    @Test
    public void getList(){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("index", 1);
        map.put("pageSize",2);
        List<Role> list = roleService.getList(map);
        System.out.println(list);
    }
    @Test
    public void getObjectById(){
        Role objectById = roleService.getObjectById(3);
        System.out.println(objectById);
    }

    @Test
    public void getTotalCount(){
        Integer totalCount = roleService.getTotalCount();
        System.out.println(totalCount);
    }


}
