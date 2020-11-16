package com.wangteng.mclient.controller;


import com.wangteng.mclient.annotation.MLogFunction;
import com.wangteng.mclient.base.MObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MController extends MObject {
    @GetMapping("/test")
    @MLogFunction
    public String test(){
        return "hello";
    }

    @GetMapping("/test2")
    public Object test2(){
        return "name";
    }
}
