package vn.com.learningspring.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.learningspring.entity.PlayingWithNeonEntity;
import vn.com.learningspring.repository.IPlayingWithNeonRepository;
import vn.com.learningspring.services.IPlayingWithNeonService;

import java.util.List;

@Service
public class PlayingWithNeonServiceImpl implements IPlayingWithNeonService {

    @Autowired
    IPlayingWithNeonRepository iPlayingWithNeonRepository;

    @Override
    public List<PlayingWithNeonEntity> check() {
        Iterable<PlayingWithNeonEntity> lst = iPlayingWithNeonRepository.findAll();
        return (List<PlayingWithNeonEntity>) lst;
    }
}
