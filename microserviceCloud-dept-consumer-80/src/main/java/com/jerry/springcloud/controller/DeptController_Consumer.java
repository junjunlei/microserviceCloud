package com.jerry.springcloud.controller;

import com.jerry.springcloud.entities.Dept;
import com.jerry.springcloud.service.DeptFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Jerry
 * @create 2019-08-11 9:25
 */
@RestController
public class DeptController_Consumer {

    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    /**
     * 改成真正的微服务
     */
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
    /**
     * 使用RestTemplate访问restful接口非常简单粗暴
     * （url,requestMap,ResponseBean.class）
     * 这三个参数分别代表REST请求地址、请求参数、HTTP响应被转换成的对象类型
     */
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @GetMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

    // 测试@EnableDiscoveryClient,消费端可以调用服务发现
    @RequestMapping(value = "/consumer/dept/discovery")
    public Object discovery()
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
    }

    @Autowired
    DeptFeignService deptFeignService;
    @RequestMapping(value = "/feign/{id}")
    public Object feign(@PathVariable("id") Integer id)
    {
        return deptFeignService.get(id);
    }
}
