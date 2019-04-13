package com.qf.service.impl;

import com.qf.mapper.UserInfoMapper;
import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import com.qf.vo.UserInfoVo;
import com.qf.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;

    
    public Integer addObject(UserInfo userInfo) {
        System.out.println(userInfoMapper);
        Integer integer = userInfoMapper.addObject(userInfo);
        return integer;
    }

    
    public Integer updateObject(UserInfo userInfo) {
        Integer integer = userInfoMapper.updateObject(userInfo);
        return integer;
    }

    
    public Integer deleteObject(Integer id) {
        Integer integer = userInfoMapper.deleteObject(id);
        return integer;
    }

    
    public List<UserInfo> getList(Map map) {
        return userInfoMapper.getList(map);
    }

    
    public List<UserInfo> findAll() {
        return userInfoMapper.findAll();
    }


    
    public UserInfo getObjectById(Integer id) {
        return userInfoMapper.getObjectById(id);
    }

    
    public Integer batchDel(UserVo userVo) {
        return userInfoMapper.batchDel(userVo);
    }

    
    public Integer getTotalCount() {
        return userInfoMapper.getTotalCount();
    }

    
    public List<UserInfo> searchByWord(UserInfo userInfo) {
        return userInfoMapper.searchByWord(userInfo);
    }


    
    public boolean loginCheck(UserInfo userInfo) {
         return userInfoMapper.loginCheck(userInfo)!=null?true:false;
    }

    
    public Integer getCount(UserInfoVo userInfoVo) {
        return userInfoMapper.getCount(userInfoVo);
    }

    
    public List<UserInfo> getUserInfosPageBy(UserInfoVo userInfoVo) {
        return userInfoMapper.getUserInfosPageBy(userInfoVo);
    }
}
