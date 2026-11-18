package kh.edu.istad.b02m2restapi.service.impl;

import kh.edu.istad.b02m2restapi.Repository.UserRepositry;
import kh.edu.istad.b02m2restapi.model.User;
import kh.edu.istad.b02m2restapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServerImpl implements UserService {
    private final UserRepositry userRepositry;

    @Override
    public List<User> getAll(){
        return userRepositry.selectAll();
    }

    public User getById(UUID id){
        return userRepositry.selectById(id).orElseThrow(() -> new RuntimeException("User not found" + id));
    }





}
