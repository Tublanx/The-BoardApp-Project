package com.lgh.springbootwebservice.web;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IndexControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void load_mainPage() {
        // when
        String body = this.restTemplate.getForObject("/", String.class);

        // then
        Assertions.assertEquals(body, "스프링 부트로 시작하는 웹 서비스");
    }
}