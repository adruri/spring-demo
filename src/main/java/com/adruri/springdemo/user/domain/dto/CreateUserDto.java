package com.adruri.springdemo.user.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CreateUserDto {

    private String name;
    private String email;
}
