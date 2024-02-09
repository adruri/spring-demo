package com.adruri.springdemo.user.domain.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UuidGenerator implements UniqueIdGenerator {
    @Override
    public String createId() {
        return UUID.randomUUID().toString();
    }
}
