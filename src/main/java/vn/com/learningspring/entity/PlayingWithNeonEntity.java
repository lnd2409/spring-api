package vn.com.learningspring.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table(name = "playing_with_neon")
public class PlayingWithNeonEntity {

    @Column("id")
    private Long id;

    @Column("name")
    private String name;

    @Column("value")
    private double value;
}
