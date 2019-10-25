package com.hnguigu.health;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.hnguigu.health.mapper"})
public class HealthMemberServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthMemberServiceApplication.class,args);
    }


}
