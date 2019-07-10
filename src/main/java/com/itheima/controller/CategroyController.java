package com.itheima.controller;

import com.itheima.domain.Categroy;
import com.itheima.service.ICategroyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Francis.G.Yang
 * @version v1.0
 * @date 2019/7/9 19:25
 * @description TODO
 **/

@Controller("controller")
@RequestMapping("categroy")
public class CategroyController {

    @Autowired
    private ICategroyService categroyService;

    @RequestMapping("queryAllCategroy")
    @ResponseBody
    public List<Categroy> queryAllCategroy(){
        List<Categroy> categroys = categroyService.queryAllCategroy();
        System.out.println("categroys = " + categroys);
        return categroys;
    }
}
