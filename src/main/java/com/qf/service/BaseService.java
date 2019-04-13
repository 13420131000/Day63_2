package com.qf.service;

import com.qf.vo.UserVo;

import java.util.List;
import java.util.Map;

public interface BaseService<T> {
    Integer addObject(T t);
    Integer updateObject(T t);
    Integer deleteObject(Integer id);
    List<T> getList(Map map);
    List<T> findAll();
    T getObjectById(Integer id);
    Integer batchDel(UserVo userVo);
    Integer getTotalCount();
    List<T> searchByWord(T t);

}
