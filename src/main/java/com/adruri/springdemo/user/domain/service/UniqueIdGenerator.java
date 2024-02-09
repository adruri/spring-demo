package com.adruri.springdemo.user.domain.service;

public interface UniqueIdGenerator {

    /**
     * Creates a unique identifier
     *
     * @return the unique identifier
     */
    String createId();
}
