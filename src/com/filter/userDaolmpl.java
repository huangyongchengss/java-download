package com.filter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class userDaolmpl implements userDao {

    @Override
    public boolean login(String name, String pwd) {
        boolean flag = false;
        try{
            connectDatabase.init();
            ResultSet rs = connectDatabase.selectSql("SELECT * FROM user where name='"+name+"' AND pwd='"+pwd+"'");
            while (rs.next()){
                if (rs.getString("name").equals(name)&&rs.getString("pwd").equals(pwd)){
                    flag = true;
                }
                connectDatabase.closeConn();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean register(userData user) {
        boolean flag = false;
        connectDatabase.init();
        int i = connectDatabase.addUpdDel("INSERT INTO user(name,pwd,sex)"+"values('"+user.getName()+"','"+user.getPwd()+"','"+user.getSex()+"')");
        if (i>0){
            flag = true;
        }
        connectDatabase.closeConn();
        return flag;
    }

    @Override
    public List<userData> getUserAll() {
        List<userData> list = new ArrayList<>();
        try{
            connectDatabase.init();
            ResultSet rs = connectDatabase.selectSql("SELECT * FROM user");
            while (rs.next()){
                userData user = new userData();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setPwd(rs.getString("pwd"));
                user.setSex(rs.getString("sex"));
                list.add(user);
            }
            connectDatabase.closeConn();
            return list;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        boolean flag = false;
        connectDatabase.init();
        String sql = "DELETE FROM user WHERE id="+id;
        int i = connectDatabase.addUpdDel(sql);
        if (i>0){
            flag = true;
        }
        connectDatabase.closeConn();
        return flag;
    }

    @Override
    public boolean update(int id, String name, String pwd, String sex) {
        boolean flag = false;
        connectDatabase.init();
        String sql = "UPDATE user set name ='"+name+"',pwd ='"+pwd+"',sex ='"+sex+"' WHERE id = "+id;
        int i = connectDatabase.addUpdDel(sql);
        if (i>0) {
            flag = true;
        }
        connectDatabase.closeConn();
        return flag;
    }
}
