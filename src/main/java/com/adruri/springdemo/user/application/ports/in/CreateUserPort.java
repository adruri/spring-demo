package com.adruri.springdemo.user.application.ports.in;

import com.adruri.springdemo.user.domain.dto.CreateUserDto;

public interface CreateUserPort {

    /**
     * Creates a new user
     *
     * @param user the new user to create
     * @return the unique identifier of the newly created user
     */
    String createUser(CreateUserDto user);
}
