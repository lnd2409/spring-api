package vn.com.learningspring.repository;

import org.springframework.data.mirage.repository.MirageRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.com.learningspring.dto.SearchDto;
import vn.com.learningspring.entity.UsersEntity;

import java.util.List;
@Repository
public interface IUserRepository extends MirageRepository<UsersEntity, Long> {
    List<UsersEntity> findAllUser(@Param("searchDto") SearchDto searchDto);
}
