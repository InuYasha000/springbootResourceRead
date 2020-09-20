package cn.iocoder.springboot.mvc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

//@Component
@Validated
@ConfigurationProperties(prefix = "server")
public class TestProperties {

//    @Max(100)
    private Integer port;

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getPort() {
        return port;
    }

}