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
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        //默认是轮询，这里自动义为随机，也可以自己写算法
        return new RandomRule();
        //return new RoundRobinRule();
    }
}
