package com.qf.mapper;

import com.qf.pojo.UserInfo;
import com.qf.vo.UserInfoVo;
import com.qf.vo.UserVo;

import java.util.List;

public interface UserInfoMapper extends BaseMapper<UserInfo> {
    UserInfo loginCheck(UserInfo userInfo);
    Integer getCount(UserInfoVo userInfoVo);
    List<UserInfo> getUserInfosPageBy(UserInfoVo userInfoVo);
    Integer batchDel(UserVo userVo);
}
