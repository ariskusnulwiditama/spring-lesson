package com.lesson.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lesson.data.People;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class BeanConfiguration {

    @Bean
    People people() {
        People people = new People();
        log.info("Create bean People");
        return people;
    }


}
