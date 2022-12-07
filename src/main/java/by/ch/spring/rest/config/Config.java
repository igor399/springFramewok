package by.ch.spring.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("by.ch.spring.rest")
public class Config {


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
