package com.pandawork.mapper;

import com.pandawork.common.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/*
 **
 * description:UserMapper
 * @author: lusi
 * @time: 2015/8/26 16:57
 */
public interface UserMapper {

    /**
     * 根据id查询用户
     * @param id
     * @return
     * @throws Exception
     */
    public User queryById(@Param("id") int id) throws Exception;

    /**
     * 添加用户
     * @param user
     * @throws Exception
     */
    public void newUser( User user) throws Exception;

    /**
     * 更新
     * @param user
     * @throws Exception
     */
    public void update(@Param("user") User user) throws Exception;

    /**
     * 根据id删除用户
     * @param id
     * @throws Exception
     */
    public void deleteById(@Param("id") int id) throws Exception;

    /**
     * 用户列表
     * @return
     * @throws Exception
     */
    public List<User> listAll() throws Exception;

    /**
     *
     * @param userName
     * @return
     * @throws Exception
     */
    public String queryIndepw(@Param("userName")String userName)  throws Exception;

    /**
     * 根据用户名查询用户
     * @param userName
     * @return
     * @throws Exception
     */
    public User queryByUserName(String userName) throws Exception;

    /**
     *
     * @param userName
     * @return
     * @throws Exception
     */
    public int countByUserName(@Param("userName") String userName) throws Exception;
}
