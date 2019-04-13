package com.qf.mapper;

import com.qf.vo.UserVo;

import java.util.List;
import java.util.Map;

public interface BaseMapper<T> {
    Integer addObject(T t);
    Integer updateObject(T t);
    Integer deleteObject(Integer id);
    List<T> getList(Map map);
    List<T> findAll();
    Integer getTotalCount();
    T getObjectById(Integer id);
    Integer batchDel(UserVo userVo);
    List<T> searchByWord(T t);
}
