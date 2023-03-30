package com.example.spybeanclassnotfound;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) // It would work with MOCK, but I need RANDOM_PORT
class SpybeanClassnotfoundApplicationTests {

    // Creating a MockBean would work. Creating SpyBeans of services would work.
    // Just this specific case of creating a SpyBean for a repository interface that is required in a @Configuration class fails.
    @SpyBean
    private SpybeanClassnotfoundRepository spybeanClassnotfoundRepository;

    // Try to run this test:
    @Test
    void contextLoads() {
    }

}
