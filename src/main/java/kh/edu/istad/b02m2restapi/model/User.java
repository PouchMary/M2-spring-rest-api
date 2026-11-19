package kh.edu.istad.b02m2restapi.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Enitity
@Table(nanme="m2_uses")
public class User {
    @ID
    @GenerateValue(strategy = GeneratedType.UUID)

    private String name;
    private String username;
    private String password;
    private Boolean isActive;
    private UUID id;

}
