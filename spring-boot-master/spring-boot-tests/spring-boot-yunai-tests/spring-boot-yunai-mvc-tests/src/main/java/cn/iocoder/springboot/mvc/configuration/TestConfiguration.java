package cn.iocoder.springboot.mvc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConditionalOnClass(value = {DemoController.class})
//@Conditional(TestCondition.class)
//@ConditionalOnNotWebApplication
public class TestConfiguration {

    @Bean
//    @Conditional(TestCondition.class)
    public Object testObject() {
        return new Object();
    }

}