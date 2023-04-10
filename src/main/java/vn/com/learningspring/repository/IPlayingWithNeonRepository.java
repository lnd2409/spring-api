package vn.com.learningspring.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.com.learningspring.entity.PlayingWithNeonEntity;

@Repository
public interface IPlayingWithNeonRepository extends CrudRepository<PlayingWithNeonEntity, Long> {
    @Query("select count(1) from playing_with_neon")
    int check();

    @Query("select name from playing_with_neon where id = :id")
    String checkName(@Param("id") Long id);
}
