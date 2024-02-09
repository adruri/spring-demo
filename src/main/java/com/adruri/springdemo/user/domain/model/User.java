package com.adruri.springdemo.user.domain.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {

    private String uniqueId;
    private String name;
    private String email;
}
