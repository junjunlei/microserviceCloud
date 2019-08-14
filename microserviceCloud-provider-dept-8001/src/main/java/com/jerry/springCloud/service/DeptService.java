package com.jerry.springCloud.service;

import com.jerry.springCloud.entities.Dept;

import java.util.List;

/**
 * @author Jerry
 * @create 2019-08-09 20:09
 */
public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
