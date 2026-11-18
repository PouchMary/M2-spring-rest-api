
package kh.edu.istad.b02m2restapi.controller;

import kh.edu.istad.b02m2restapi.Repository.UserRepositry;
import kh.edu.istad.b02m2restapi.model.User;
import kh.edu.istad.b02m2restapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserRepositry userRepositry;
    @PostMapping
    public String create(@RequestBody User user) {

        user.setId(UUID.randomUUID());
        user.setIsActive(true);

        userRepositry.insert(user);

        return "User created successfully!";
    }




}
