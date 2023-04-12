package vn.com.learningspring.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table(name = "users")
public class UsersEntity {
    @Column("id")
    @Id
    private Long id;

    @Column("username")
    private String username;

    @Column("password")
    private String password;


    @Column("email")
    private String email;
}
