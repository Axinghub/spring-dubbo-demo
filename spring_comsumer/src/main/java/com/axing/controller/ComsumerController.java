package com.axing.controller;

import com.axing.service.impl.ComsumerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComsumerController {
    @Autowired
    ComsumerServiceImpl comsumerService;
    @RequestMapping("/insetuser")
    public String insetUser(){
        comsumerService.userInsert();
        return  "666666666666666666";
    }
}
