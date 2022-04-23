package com.lgh.springbootwebservice.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter // getter 메소드 추가
@RequiredArgsConstructor // 선언된 모든 final 필드가 모함된 생성자 생성 (final이 없는 필드는 포함 x)
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
