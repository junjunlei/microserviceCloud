package com.jerry.springcloud.controller;

import com.jerry.springcloud.entities.Dept;
import com.jerry.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Jerry
 * @create 2019-08-09 20:14
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService service;


    /**
     * 服务熔断（基于服务端，保护服务的作用 （服务不能挂）） 一旦服务方法调用失败或者抛异常后
     * 会调用 @HystrixCommand(fallbackMethod = "processGet")
     * fallbackMethod指定的方法
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "processGet")
    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept =  this.service.get(id);
        if(null == dept)
        {
            throw new RuntimeException("该ID："+id+"没有没有对应的信息");
        }
        return dept;

    }

    public Dept processGet(@PathVariable("id") Long id){
        Dept dept=new Dept();
        dept.setDeptNo(id);
        dept.setDName("该id:"+id+" "+"没有对应信息");
        dept.setDbSource("no database in MySQL");
        return dept;
    }
}
