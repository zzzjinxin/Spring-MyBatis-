package com.aaa.dao;

import com.aaa.entity.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
public interface UserDao {
    //查询所有的用户信息
    public List<User> listAll();
    //查询当前用户名是XX的角色是xx的信息
    public List<User> findByName( User user);
    //查询当前用户名是XX的角色是xx的信息
    public List<User> findByNameTwo(Map<String,Object> map);
    public  int update(User user);
    //set
    public  int updateTwo(User user);
    // trim if
    public  int updateThree(@Param("id") int id,@Param("userName") String userName,@Param("userPassword") String userPassword,@Param("address") String address);
    //查询 foreach
    public List<User> findByUserRole(Integer[] array);
    //查询 foreach
    public List<User> findByUserId(List<Integer> ids);
    //查询 foreach
    public List<User> findByUserIdTwo(Map<String,Object> map);
    //根据用户名，角色，地址进行查询
    public List<User>  findByNameRoleAdd(User user);
    //分页
    public List<User> page(@Param("pageNo") int pageNo,@Param("pageSize") int pageSize);
}
