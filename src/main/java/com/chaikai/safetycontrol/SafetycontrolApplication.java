package com.chaikai.safetycontrol;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication(scanBasePackages = {"com.chaikai.safetycontrol"})
@MapperScan("com.chaikai.safetycontrol.dao")
public class SafetycontrolApplication {

    public static void main(String[] args) {
        SpringApplication.run(SafetycontrolApplication.class, args);
    }

}
