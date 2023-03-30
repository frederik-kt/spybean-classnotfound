package com.example.spybeanclassnotfound;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeConfiguration {

    private final SomeRepository someRepository;

    public SomeConfiguration(SomeRepository someRepository) {
        this.someRepository = someRepository;
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new TestServlet(someRepository), "/test-servlet/*");
    }
}
