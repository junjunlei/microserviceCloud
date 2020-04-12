package com.jerry.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @EnableZuulProxy
 * @author Jerry
 * @create 2019-08-09 20:25
 */
@SpringBootApplication
@EnableZuulProxy
public class ZullGatewayApp9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZullGatewayApp9527.class,args);
    }
}
