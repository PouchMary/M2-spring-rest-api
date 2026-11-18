package kh.edu.istad.b02m2restapi.service;

import kh.edu.istad.b02m2restapi.Repository.UserRepositry;
import kh.edu.istad.b02m2restapi.model.User;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;


public interface UserService  {
    List <User> getAll();
    User getById(UUID id);


}
