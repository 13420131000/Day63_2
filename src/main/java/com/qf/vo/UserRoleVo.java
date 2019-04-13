package com.qf.vo;

import java.util.List;

public class UserRoleVo {
    int userid;
    List<Integer> roleSelected;
    List<Integer> roleUnSelected;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public List<Integer> getRoleSelected() {
        return roleSelected;
    }

    public void setRoleSelected(List<Integer> roleSelected) {
        this.roleSelected = roleSelected;
    }

    public List<Integer> getRoleUnSelected() {
        return roleUnSelected;
    }

    public void setRoleUnSelected(List<Integer> roleUnSelected) {
        this.roleUnSelected = roleUnSelected;
    }

    @Override
    public String toString() {
        return "UserRoleVo{" +
                "userid=" + userid +
                ", roleSelected=" + roleSelected +
                ", roleUnSelected=" + roleUnSelected +
                '}';
    }
}
