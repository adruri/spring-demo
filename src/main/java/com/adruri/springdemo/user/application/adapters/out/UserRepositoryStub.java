package com.adruri.springdemo.user.application.adapters.out;

import com.adruri.springdemo.user.application.ports.out.UserRepositoryPort;
import com.adruri.springdemo.user.domain.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserRepositoryStub implements UserRepositoryPort {

    @Override
    public void save(User user) {
        // Persist user
    }
}
