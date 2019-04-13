package com.qf.service;

import com.qf.dto.RoleInfoDto;
import com.qf.pojo.Role;
import com.qf.vo.SearchVo;
import com.qf.vo.UserRoleVo;

import java.util.List;

public interface RoleService extends BaseService<Role> {
    public List<RoleInfoDto> getRoleByUserId(Integer id);
    public Integer setRoleFalse(UserRoleVo userRoleVo);
    public Integer setRoleTrue(UserRoleVo userRoleVo);
    List<Role> getRoleBy(SearchVo searchVo);
}
