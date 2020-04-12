package com.jerry.springcloud.service;

import com.jerry.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author Jerry
 * @create 2020-04-12 0:41
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptFeignServiceFallbackFactory.class)
public interface DeptFeignService {

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
     List<Dept> list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
     boolean add(Dept dept);
}
