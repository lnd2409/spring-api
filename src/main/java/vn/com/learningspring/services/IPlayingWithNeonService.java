package vn.com.learningspring.services;

import vn.com.learningspring.dto.SearchDto;
import vn.com.learningspring.entity.PlayingWithNeonEntity;
import vn.com.learningspring.entity.UsersEntity;

import java.util.List;
import java.util.Map;

public interface IPlayingWithNeonService {
    List<PlayingWithNeonEntity> check();
    List<UsersEntity> getAll(SearchDto searchDto);
}
