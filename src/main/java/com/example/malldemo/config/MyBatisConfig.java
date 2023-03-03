package com.example.malldemo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.malldemo.mbg.mapper")
public class MyBatisConfig {
}
