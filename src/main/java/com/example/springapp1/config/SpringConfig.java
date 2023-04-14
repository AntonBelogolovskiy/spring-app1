package com.example.springapp1.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.springapp1")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {


}
