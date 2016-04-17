package com.pandawork.service;

import com.pandawork.common.entity.Student;
import com.pandawork.common.entity.User;
import com.pandawork.core.common.exception.SSException;

import java.util.List;

/**
 * UserService
 *
 * @author: mayuan
 * @time: 2015/3/26 19:25
 */
public interface StudentService {

    /**
     * 判断登录
     * @param studentNumber
     * @param password
     * @return
     * @throws SSException
     */
    public boolean checkLogin(Integer studentNumber,String password) throws SSException;

    /**
     * 根据学号查询学生
     * @param studentNumber
     * @return
     * @throws SSException
     */
    public Student queryByStudentNumber(Integer studentNumber) throws SSException;

    /**
     * 更新
     * @param student
     * @throws SSException
     */
    public void update(Student student) throws SSException;

}
