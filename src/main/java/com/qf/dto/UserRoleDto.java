package com.qf.dto;

import java.util.List;

public class UserRoleDto {
    int id;
    List<Integer>roleSelected;
    List<Integer>roleUnSelected;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "UserRoleDto{" +
                "id=" + id +
                ", roleSelected=" + roleSelected +
                ", roleUnSelected=" + roleUnSelected +
                '}';
    }
}
