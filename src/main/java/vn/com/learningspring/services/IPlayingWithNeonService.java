package vn.com.learningspring.services;

import vn.com.learningspring.entity.PlayingWithNeonEntity;

import java.util.List;
import java.util.Map;

public interface IPlayingWithNeonService {
    Map<String, List<PlayingWithNeonEntity>> check();
}
