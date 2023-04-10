package vn.com.learningspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import vn.com.learningspring.base.AbstractRest;
import vn.com.learningspring.common.ApiResponse;
import vn.com.learningspring.entity.PlayingWithNeonEntity;
import vn.com.learningspring.services.IPlayingWithNeonService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
public class PlayingWithNeonController extends AbstractRest {

    @Autowired
    IPlayingWithNeonService iPlayingWithNeonService;

    @GetMapping("/test")
    @ResponseBody
    public ApiResponse testApi() {
        Map<String, List<PlayingWithNeonEntity>> result = iPlayingWithNeonService.check();
        return this.handlerSuccess(200, "success", result.get("data"), 10L);
    }
}
