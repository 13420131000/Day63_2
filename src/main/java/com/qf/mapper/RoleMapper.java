package com.qf.mapper;

import com.qf.dto.RoleInfoDto;
import com.qf.dto.UserRoleDto;
import com.qf.pojo.Role;
import com.qf.vo.SearchVo;
import com.qf.vo.UserRoleVo;

import java.util.List;

public interface RoleMapper extends BaseMapper<Role> {
    List<RoleInfoDto> getRoleByUserId(Integer id);
    Integer setRoleTrue(UserRoleVo userRoleVo);
    Integer setRoleFalse(UserRoleVo userRoleVo);
    List<Role> getRoleBy(SearchVo searchVo);
}
