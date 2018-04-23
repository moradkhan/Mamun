/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojo.Login;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("save.htm")
    public String doAdd(@ModelAttribute("login") Login l, Model m) {
        LoginDao ld = new LoginDao();
        ld.doSave(l);
        return "login";
    }

    @RequestMapping("login.htm")
    public String doLogin(@ModelAttribute("login") Login l, Model m) {
        LoginDao ld = new LoginDao();
        boolean b = ld.doQuery(l.getEmail(), l.getPassword());
        List<Login> li=ld.allInfo(l.getEmail(), l.getPassword());
        if (b) {
            m.addAttribute("ai",li);
            return "success";
        } else {
            return "insert";
        }
        
    }

}
