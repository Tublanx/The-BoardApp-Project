package com.lgh.springbootwebservice.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(controllers = HelloController.class)
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void hello() throws Exception {
        String hello = "hello";

        mockMvc.perform(get("/hello")).                      // MockMvc를 통해 /hello 주소로 HTTP GET 요청을 함
                andExpect(status().isOk()).                             // perform의 결과를 검증, status 검증(200인지 아닌지 검증)
                andExpect(content().string(hello));     // perform의 결과를 검증, Controller에서 "hello"를 리턴하므로 이 값이 맞는지 검증
    }

    @Test
    public void helloDto() throws Exception {
        String name = "hello";
        int amount = 1000;

        // param : API 테스트 시 사용될 요청 파라미터 설정, 문자열만 혀용
        // jsonPath : JSON 응답값을 필드별로 검증, $를 기준으로 필드명을 명시
        mockMvc.perform(get("/hello/dto").param("name", name).param("amount", String.valueOf(amount))).
                andExpect(status().isOk()).
                andExpect(jsonPath("$.name", is(name))).
                andExpect(jsonPath("$.amount", is(amount)));
    }

}