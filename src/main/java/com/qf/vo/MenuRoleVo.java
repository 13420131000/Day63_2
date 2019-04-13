package com.qf.vo;

import java.util.List;

public class MenuRoleVo {
    int roleid;
    List<Integer> roleSelected;
    List<Integer> roleUnSelected;

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
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
        return "MenuRoleVo{" +
                "roleid=" + roleid +
                ", roleSelected=" + roleSelected +
                ", roleUnSelected=" + roleUnSelected +
                '}';
    }
}
