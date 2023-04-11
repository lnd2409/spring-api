package vn.com.learningspring.controller.impl;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import vn.com.learningspring.base.AbstractRest;
import vn.com.learningspring.common.ApiResponse;
import vn.com.learningspring.controller.IApiPlayingWithNeonRest;
import vn.com.learningspring.entity.PlayingWithNeonEntity;
import vn.com.learningspring.services.IPlayingWithNeonService;

import java.util.List;
import java.util.Map;

@RestController
@Api(tags = "Playing With Neon")
public class ApiPlayingWithNeonRestImpl extends AbstractRest implements IApiPlayingWithNeonRest {

    @Autowired
    IPlayingWithNeonService iPlayingWithNeonService;

    @GetMapping("/test")
    @ResponseBody
    public ApiResponse testApi() {
        Map<String, List<PlayingWithNeonEntity>> result = iPlayingWithNeonService.check();
        return this.handlerSuccess(200, "success", result.get("data"), 10L);
    }
}
