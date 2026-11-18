package kh.edu.istad.b02m2restapi.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private String username;
    private String password;
    private Boolean isActive;
    private UUID id;

}
