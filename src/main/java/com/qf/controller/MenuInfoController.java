package com.qf.controller;

import com.qf.pojo.UserInfo;
import com.qf.service.MenuService;
import com.qf.vo.MenuRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


@RestController
public class MenuInfoController {
    @Autowired
    MenuService menuService;


    @RequestMapping("getAllMenu")
    public Object getAllMenu(@RequestParam int roleid) {
        return menuService.getAllMenu(roleid);
    }

    @RequestMapping(value = "getAllMenuByUserId",method = RequestMethod.POST)
    public Object getAllMenuByUserId(HttpSession httpSession) {
        UserInfo userInfo = (UserInfo) httpSession.getAttribute("userInfo");

        return menuService.getAllMenuByUserId(userInfo.getUserid());
    }


    @Transactional
    @RequestMapping(value = "changeMenuList", method = RequestMethod.POST)
    public Object Test(@RequestBody MenuRoleVo menuRoleVo) {
        System.out.println(menuRoleVo);
        Integer rSet =0;
        rSet += menuService.batchDel(menuRoleVo);
        if(menuRoleVo.getRoleSelected().size()!=0){
            rSet += menuService.batchAdd(menuRoleVo);
        }

        return rSet;

    }
}



