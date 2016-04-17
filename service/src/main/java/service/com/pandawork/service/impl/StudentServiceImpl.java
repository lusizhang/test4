package com.pandawork.service.impl;

import com.pandawork.common.entity.Student;
import com.pandawork.common.utils.NFException;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.core.common.util.CommonUtil;
import com.pandawork.mapper.StudentMapper;
import com.pandawork.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * StudentServiceImpl
 * Created by chant on 2016/3/23.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;


    @Override
    public boolean checkLogin(Integer studentNumber, String password) throws SSException {
            if (Assert.isNull(studentNumber ) || Assert.isNull(password)){
                return false;
            }
            try {
                return studentMapper.countByStudentNumberAndPassword(studentNumber,password) >= 1?true:false;
            } catch (Exception e) {
                LogClerk.errLog.error(e);
                throw SSException.get(NFException.SystemException, e);
            }
        }

    @Override
    public Student queryByStudentNumber(Integer studentNumber) throws SSException {
        if (Assert.isNull(studentNumber)) {
            return null;
        }
        try {
            return studentMapper.queryByStudentNumber(studentNumber);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    public void update(Student student) throws SSException {
        if(Assert.isNull(student)){
            return ;
        }
        try {
            studentMapper.update(student);
        } catch(Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }
}

