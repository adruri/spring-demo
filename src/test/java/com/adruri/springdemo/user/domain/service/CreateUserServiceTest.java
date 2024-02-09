package com.adruri.springdemo.user.domain.service;

import com.adruri.springdemo.user.application.ports.out.UserRepositoryPort;
import com.adruri.springdemo.user.domain.model.User;
import com.adruri.springdemo.user.domain.dto.CreateUserDto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

public class CreateUserServiceTest {

    private AutoCloseable mockitoCloseable;

    private CreateUserService service;

    @Mock
    private UserRepositoryPort userRepository;

    @BeforeEach
    void setup() {
        mockitoCloseable = MockitoAnnotations.openMocks(this);

        service = new CreateUserService(new UuidGenerator(), userRepository);
    }

    @AfterEach
    void destroy() throws Exception {
        mockitoCloseable.close();
    }

    @Test
    void createUser_shouldReturnUserId() {

        CreateUserDto user = CreateUserDto.builder()
                .name("Fabi")
                .email("fabioli@gmail.com")
                .build();

        String id = service.createUser(user);

        assertThat(id).isNotBlank();
    }

    @Test
    void createUser_shouldPersistUser() {
        CreateUserDto user = CreateUserDto.builder()
                .name("Fabi")
                .email("fabioli@gmail.com")
                .build();

        service.createUser(user);

        verify(userRepository).save(any(User.class));
    }
}
