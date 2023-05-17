package vn.com.learningspring.repository;

import org.springframework.data.mirage.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.com.learningspring.entity.PlayingWithNeonEntity;

@Repository
public interface IPlayingWithNeonRepository extends CrudRepository<PlayingWithNeonEntity, Long> {

}
