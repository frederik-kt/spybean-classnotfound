package com.example.spybeanclassnotfound;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    private final SpybeanClassnotfoundRepository spybeanClassnotfoundRepository;

    public TestConfiguration(SpybeanClassnotfoundRepository spybeanClassnotfoundRepository) {
        this.spybeanClassnotfoundRepository = spybeanClassnotfoundRepository;
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new TestServlet(spybeanClassnotfoundRepository), "/test-servlet/*");
    }
}
