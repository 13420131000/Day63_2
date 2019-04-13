package com.qf.dto;

import com.qf.pojo.UserInfo;
import com.qf.tools.Page;

import java.util.List;

public class UserInfoDto {
    List<UserInfo> userInfoList;
    Page page;

    public List<UserInfo> getUserInfoList() {
        return userInfoList;
    }

    public void setUserInfoList(List<UserInfo> userInfoList) {
        this.userInfoList = userInfoList;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "UserInfoDto{" +
                "userInfoList=" + userInfoList +
                ", page=" + page +
                '}';
    }
}
