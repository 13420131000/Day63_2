package com.qf.service.impl;

import com.qf.dto.MenuInfoDto;
import com.qf.mapper.MenuInfoMapper;
import com.qf.service.MenuService;
import com.qf.vo.MenuRoleVo;
import com.qf.vo.MenuVo;
import com.qf.vo.UserRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuInfoMapper menuInfoMapper;

    public List<MenuInfoDto> getAllMenu(int roleid) {
        return menuInfoMapper.getAllMenu(roleid);
    }



    public Integer batchAdd(MenuRoleVo vo) {
        return menuInfoMapper.batchAdd(vo);
    }

    public Integer batchDel(MenuRoleVo vo) {
        return menuInfoMapper.batchDel(vo);
    }

    public List<Integer> getAllMenuByUserId(int userid) {
        return menuInfoMapper.getAllMenuByUserId(userid);
    }

}
