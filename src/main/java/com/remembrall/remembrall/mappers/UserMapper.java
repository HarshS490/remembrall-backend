package com.remembrall.remembrall.mappers;

import com.remembrall.remembrall.dto.UserDto;
import com.remembrall.remembrall.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User transformUserDtoToUser(UserDto userDto) {
        return new User(
                userDto.username(),
                null,
                null
        );
    }
    public UserDto transformUserToUserDto(User user) {
        return new UserDto(user.getUsername());
    }
}
