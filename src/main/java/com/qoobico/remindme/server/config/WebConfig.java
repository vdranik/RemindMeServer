package com.qoobico.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by User on 1/10/2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.qoobico.remindme.server")
public class WebConfig extends WebMvcConfigurerAdapter{
}
