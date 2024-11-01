package com.Optimart.dto.User;

import com.Optimart.models.Role;
import lombok.*;

import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateUserDTO {
    private String email;
    private String role;
    private String firstName;
    private String middleName;
    private String address;
    private String lastName;
    private String phoneNumber;
    private String password;
    private String city;

}
