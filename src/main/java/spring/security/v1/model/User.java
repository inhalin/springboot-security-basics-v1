package spring.security.v1.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private String email;
    @Column(columnDefinition = "varchar(255) default 'ROLE_USER'")
    private String role;
    @CreatedDate
    private Timestamp createdDate;
}
