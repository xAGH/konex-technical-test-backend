package xagh.technical_test.konex.client.domain.entities;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Client {
    private UUID uuid;
    private String document;
    private String name;
    private String address;
    private String phone;
    private String email;
    private LocalDate registrationDate;
    private Boolean status;

    public Client(
        String document,
        String name,
        String address,
        String phone,
        String email,
        LocalDate registrationDate,
        Boolean status
    ) {
        this.uuid = UUID.randomUUID();
        this.document = document;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.registrationDate = registrationDate;
        this.status = status;
    }

}