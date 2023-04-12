package vn.com.learningspring.repository;

import org.springframework.data.repository.CrudRepository;
import vn.com.learningspring.entity.UsersEntity;

public interface IUserRepository extends CrudRepository<UsersEntity, Long> {
}
