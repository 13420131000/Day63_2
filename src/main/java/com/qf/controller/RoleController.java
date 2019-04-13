package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.Role;
import com.qf.service.RoleService;
import com.qf.vo.SearchVo;
import com.qf.vo.UserRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    RoleService roleService;

    @RequestMapping(value = "getRoleByUserId",method = RequestMethod.POST)
    public Object getRoleByUserId(String userid){
        return roleService.getRoleByUserId(Integer.parseInt(userid));
    }


    @Transactional
    @RequestMapping(value = "changeUserRoleByUserId",method = RequestMethod.POST)
    public Object changeUserRoleByUserId(@RequestBody UserRoleVo userRoleVo){
        System.out.println(userRoleVo);
        Integer rSet =0;

        if(userRoleVo.getRoleSelected().size()!=0){
            rSet += roleService.setRoleTrue(userRoleVo);
        }
        if(userRoleVo.getRoleUnSelected().size()!=0){
            rSet += roleService.setRoleFalse(userRoleVo);
        }
        return rSet;
    }

    @RequestMapping(value = "roleList",method = RequestMethod.POST)
    public Object roleList(@RequestBody(required = false) SearchVo searchVo){
        PageHelper.startPage(searchVo.getCurrentPage(),3);
        List<Role> all = roleService.getRoleBy(searchVo);
        PageInfo<Role> rolePageInfo = new PageInfo<Role>(all);
        return rolePageInfo;
    }

    @RequestMapping(value = "deleteRoleById",method = RequestMethod.POST)
    public Object roleList(@RequestParam int roleid){
        return roleService.deleteObject(roleid);
    }





}

