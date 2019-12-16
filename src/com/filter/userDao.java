package com.filter;

import com.filter.userData;

import java.util.List;

public interface userDao {
    public boolean login(String name, String pwd);//登录
    public boolean register(userData user);
    public List<userData> getUserAll();
    public boolean delete(int id);
    public boolean update(int id,String name,String pwd,String sex);
}
