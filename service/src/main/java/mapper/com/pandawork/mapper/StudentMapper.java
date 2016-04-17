package com.pandawork.mapper;

import com.pandawork.common.entity.Student;
import org.apache.ibatis.annotations.Param;

/**
 * description:studentMapper
 * @author: mayuan
 * @time: 2015/8/19 9:15
 */
public interface StudentMapper {


    /**
     *统计符合输入的学号及密码的学生数量
     * @param studentNumber
     * @param password
     * @return
     * @throws Exception
     *
     */
    public int countByStudentNumberAndPassword(@Param("studentNumber")int studentNumber,
                                               @Param("password")String password) throws Exception;

    /**
     * 根据学号查询学生
     * @param studentNumber
     * @return
     * @throws Exception
     */
   public Student queryByStudentNumber(@Param("studentNumber")int studentNumber) throws Exception;

    /**
     *
     * @param student
     * @throws Exception
     */
    public void update(@Param("student")Student student) throws Exception;



}


