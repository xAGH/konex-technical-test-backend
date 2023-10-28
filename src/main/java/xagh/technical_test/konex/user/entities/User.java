package xagh.technical_test.konex.user.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class User {

    private UUID uuid;
    private String name;
    private String email;
    private String password;
    private Boolean isAdmin;

}
