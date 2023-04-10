package vn.com.learningspring.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.learningspring.entity.PlayingWithNeonEntity;
import vn.com.learningspring.repository.IPlayingWithNeonRepository;
import vn.com.learningspring.services.IPlayingWithNeonService;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PlayingWithNeonServiceImpl implements IPlayingWithNeonService {

    @Autowired
    IPlayingWithNeonRepository iPlayingWithNeonRepository;

    @Override
    public Map<String, List<PlayingWithNeonEntity>> check() {
        Map<String, List<PlayingWithNeonEntity>> result = new HashMap<>();
        Iterable<PlayingWithNeonEntity> lst = iPlayingWithNeonRepository.findAll();
        List<PlayingWithNeonEntity> data = (List<PlayingWithNeonEntity>) lst;
        result.put("data", data);
        String name = iPlayingWithNeonRepository.checkName(1L);
        return result;
    }
}
