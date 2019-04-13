package com.qf.dto;

public class RoleInfoDto {
    int roleid;
    String rolename;
    int userid;

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "RoleInfoDto{" +
                "roleid=" + roleid +
                ", rolename='" + rolename + '\'' +
                ", userid=" + userid +
                '}';
    }
}
