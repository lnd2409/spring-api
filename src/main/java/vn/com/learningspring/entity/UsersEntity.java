package vn.com.learningspring.entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import jp.sf.amateras.mirage.annotation.Column;
import jp.sf.amateras.mirage.annotation.PrimaryKey;
import jp.sf.amateras.mirage.annotation.PrimaryKey.GenerationType;
import jp.sf.amateras.mirage.annotation.Table;
@Getter
@Setter
@Table(name = "users")
public class UsersEntity {
    @Column(name = "id")
    @Id
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;


    @Column(name = "email")
    private String email;
}
