package com.adruri.springdemo.user.application.ports.out;

import com.adruri.springdemo.user.domain.model.User;

public interface UserRepositoryPort {

    /**
     * Persists a user
     *
     * @param user the user to persist
     */
    void save(User user);
}
