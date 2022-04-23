package com.lgh.springbootwebservice.web;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(controllers = HelloController.class)
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void hello() throws Exception {
        String hello = "hello";

        mockMvc.perform(MockMvcRequestBuilders.get("/hello")).                      // MockMvc를 통해 /hello 주소로 HTTP GET 요청을 함
                andExpect(MockMvcResultMatchers.status().isOk()).                             // perform의 결과를 검증, status 검증(200인지 아닌지 검증)
                andExpect(MockMvcResultMatchers.content().string(hello));     // perform의 결과를 검증, Controller에서 "hello"를 리턴하므로 이 값이 맞는지 검증
    }

}