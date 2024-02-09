package com.adruri.springdemo.user.domain.service;

import com.adruri.springdemo.user.application.ports.in.CreateUserPort;
import com.adruri.springdemo.user.application.ports.out.UserRepositoryPort;
import com.adruri.springdemo.user.domain.model.User;
import com.adruri.springdemo.user.domain.dto.CreateUserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserService implements CreateUserPort {

    private final UniqueIdGenerator idGenerator;
    private final UserRepositoryPort userRepository;

    @Override
    public String createUser(CreateUserDto userDto) {

        User user = User.builder()
                .uniqueId(idGenerator.createId())
                .name(userDto.getName())
                .email(userDto.getEmail())
                .build();

        userRepository.save(user);

        return user.getUniqueId();
    }
}
