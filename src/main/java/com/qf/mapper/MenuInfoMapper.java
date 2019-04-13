package com.qf.mapper;

import com.qf.dto.MenuInfoDto;
import com.qf.vo.MenuRoleVo;


import java.util.List;

public interface MenuInfoMapper {
    public List<MenuInfoDto> getAllMenu(int roleId);
    public Integer batchAdd(MenuRoleVo vo);
    public Integer batchDel(MenuRoleVo vo);
    public List<Integer> getAllMenuByUserId(int userid);
}
