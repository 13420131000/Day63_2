package com.qf.vo;

import java.util.List;

public class UserVo {
    List<Integer> ids;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "ids=" + ids +
                '}';
    }
}
