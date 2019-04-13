package com.qf.vo;

import jdk.nashorn.internal.ir.IdentNode;

import java.util.List;

public class MenuVo {
    int roleid;
    List<Integer>menuIds;

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public List<Integer> getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(List<Integer> menuIds) {
        this.menuIds = menuIds;
    }

    @Override
    public String toString() {
        return "MenuVo{" +
                "roleid=" + roleid +
                ", menuIds=" + menuIds +
                '}';
    }
}
