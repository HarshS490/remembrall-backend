package com.remembrall.remembrall.services;

import com.remembrall.remembrall.dto.UserDto;
import com.remembrall.remembrall.entities.User;
import com.remembrall.remembrall.mappers.UserMapper;
import com.remembrall.remembrall.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserService {
    final UserRepository userRepository;
    final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Transactional
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username).orElse(null);
    }

    @Transactional
    public User createUser(UserDto userDto) {
        User user = userMapper.transformUserDtoToUser(userDto);
        LocalDate now = LocalDate.now();
        user.setCreatedAt(now);
        user.setUpdatedAt(now);
        return userRepository.save(user);
    }

}
