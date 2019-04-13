package com.qf.service;

import com.qf.dto.MenuInfoDto;
import com.qf.vo.MenuRoleVo;


import java.util.List;

public interface MenuService {
    public List<MenuInfoDto> getAllMenu(int roleid);
    public Integer batchAdd(MenuRoleVo vo);
    public Integer batchDel(MenuRoleVo vo);
    public List<Integer> getAllMenuByUserId(int userid);
}
