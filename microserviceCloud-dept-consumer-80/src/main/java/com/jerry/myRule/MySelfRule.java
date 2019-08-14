package com.jerry.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jerry
 * @create 2019-08-13 0:26
 */
@Configuration //这个类不能和@ComponentScan同包
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();  //默认是轮询，这里自动义为随机，也可以自己写算法
        //return new RoundRobinRule();
    }
}
