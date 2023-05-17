package vn.com.learningspring.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.com.learningspring.dto.SearchDto;
import vn.com.learningspring.entity.PlayingWithNeonEntity;
import vn.com.learningspring.entity.UsersEntity;
import vn.com.learningspring.repository.IPlayingWithNeonRepository;
import vn.com.learningspring.repository.IUserRepository;
import vn.com.learningspring.services.IPlayingWithNeonService;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class PlayingWithNeonServiceImpl implements IPlayingWithNeonService {

//    @Autowired
//    IPlayingWithNeonRepository iPlayingWithNeonRepository;

    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public List<PlayingWithNeonEntity> check() {
        return new ArrayList<>();
    }

    @Override
    public List<UsersEntity> getAll(SearchDto searchDto) {
        return iUserRepository.findAllUser(searchDto);
    }
}
