package com.pandawork.web.controller;

import com.pandawork.common.entity.Student;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.web.spring.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


/**
 * StudentController
 *
 * @author: mayuan
 * @time: 2015/8/26 16:57
 */
@Controller
@RequestMapping(value = "")
public class StudentController extends AbstractController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String tologin(Model model) {
        return "/login";
    }

    @RequestMapping(value = "form",method=RequestMethod.POST)
    public String toform(Model model,@RequestParam("stuNum")Integer stuNum,@RequestParam("pwd")String pwd)
    {
        try {
            if(studentService.checkLogin(stuNum,pwd)){
                model.addAttribute("student",studentService.queryByStudentNumber(stuNum));
                return "form";
            }else{
                return "login";
            }
        } catch (SSException ee) {
            LogClerk.errLog.error(ee);
            sendErrMsg(ee.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value="edit",method = RequestMethod.GET)
    public String toedit(Student student){
        try {
            studentService.update(student);
            return "redirect:/form";
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

}


