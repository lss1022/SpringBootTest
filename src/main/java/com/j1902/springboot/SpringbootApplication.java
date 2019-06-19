package com.j1902.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.j1902.springboot.mapper") //配置mapper接口的位置
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
//        SpringApplication application = new SpringApplication(SpringbootApplication.class);
//        application.setBannerMode(Banner.Mode.OFF);
//        application.run(args);
    }

}
