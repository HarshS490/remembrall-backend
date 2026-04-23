package com.remembrall.remembrall.endpoints;

import com.remembrall.remembrall.dto.UserDto;
import com.remembrall.remembrall.entities.User;
import com.remembrall.remembrall.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UsersEndpoint {

    final UserService userService;

    public UsersEndpoint(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    @PostMapping
    public User createUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }

}
