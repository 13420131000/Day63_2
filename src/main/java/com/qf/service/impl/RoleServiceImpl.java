package com.qf.service.impl;

import com.qf.dto.RoleInfoDto;
import com.qf.mapper.RoleMapper;
import com.qf.pojo.Role;
import com.qf.service.RoleService;
import com.qf.vo.SearchVo;
import com.qf.vo.UserRoleVo;
import com.qf.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;

    
    public Integer addObject(Role role) {
        System.out.println(roleMapper.addObject(role));
        return roleMapper.addObject(role);
    }

    
    public Integer updateObject(Role role) {
        return roleMapper.updateObject(role);
    }

    
    public Integer deleteObject(Integer id) {
        return roleMapper.deleteObject(id);
    }

    
    public List<Role> getList(Map map) {
        return roleMapper.getList(map);
    }

    
    public List<Role> findAll() {
        return roleMapper.findAll();
    }

    
    public Role getObjectById(Integer id) {
        return roleMapper.getObjectById(id);
    }

    
    public Integer batchDel(UserVo userVo) {
        return roleMapper.batchDel(userVo);
    }

    
    public Integer getTotalCount() {
        return roleMapper.getTotalCount();
    }

    
    public List<Role> searchByWord(Role role) {
        return roleMapper.searchByWord(role);
    }


    
    public List<RoleInfoDto> getRoleByUserId(Integer id) {
        return roleMapper.getRoleByUserId(id);
    }

    
    public Integer setRoleFalse(UserRoleVo userRoleVo) {
        return roleMapper.setRoleFalse(userRoleVo);
    }

   
    public Integer setRoleTrue(UserRoleVo userRoleVo) {
        return roleMapper.setRoleTrue(userRoleVo);
    }

    public List<Role> getRoleBy(SearchVo searchVo) {
        return roleMapper.getRoleBy(searchVo);
    }


}

