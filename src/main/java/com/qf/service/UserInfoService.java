package com.qf.service;

import com.qf.pojo.UserInfo;
import com.qf.vo.UserInfoVo;

import java.util.List;

public interface UserInfoService extends BaseService<UserInfo> {
    public boolean loginCheck(UserInfo userInfo);
    Integer getCount(UserInfoVo userInfoVo);
    List<UserInfo> getUserInfosPageBy(UserInfoVo userInfoVo);

}
