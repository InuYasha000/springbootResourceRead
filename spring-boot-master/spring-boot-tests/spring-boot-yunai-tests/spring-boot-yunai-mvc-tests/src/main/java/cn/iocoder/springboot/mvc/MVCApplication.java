package cn.iocoder.springboot.mvc;

import cn.iocoder.springboot.mvc.config.TestProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication(exclude = {SpringApplicationAdminJmxAutoConfiguration.class},
    excludeName = "org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration1",
    scanBasePackages = "cn.iocoder")
@EnableConfigurationProperties(TestProperties.class)
public class MVCApplication {

    @Bean
    @Profile("prod")
    public Object prodObject() {
        return new Object();
    }

    @Bean
    @Profile("dev")
    public Object devObject() {
        return new Object();
    }

    public static void main(String[] args) {
//        BeanDefinitionLoader
        ApplicationContext context = SpringApplication.run(MVCApplication.class, args);

//        System.out.println(context.getBean(TestProperties.class).getPort());

//        Map<String, Object> properties = new HashMap<>();
//        properties.put("test", true);
//        new SpringApplicationBuilder().run(args);
    }

}