package vn.com.learningspring.controller.impl;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import vn.com.learningspring.base.AbstractRest;
import vn.com.learningspring.common.CommonConstant;
import vn.com.learningspring.controller.IApiPlayingWithNeonRest;
import vn.com.learningspring.dto.SearchDto;
import vn.com.learningspring.dto.rest.common.DtsApiResponse;
import vn.com.learningspring.entity.PlayingWithNeonEntity;
import vn.com.learningspring.entity.UsersEntity;
import vn.com.learningspring.services.IPlayingWithNeonService;

import java.util.List;

@RestController
@Api(tags = "Playing With Neon")
public class ApiPlayingWithNeonRestImpl extends AbstractRest implements IApiPlayingWithNeonRest {

    private static final Logger logger = LoggerFactory.getLogger(ApiPlayingWithNeonRestImpl.class);

    @Autowired
    IPlayingWithNeonService iPlayingWithNeonService;

    @GetMapping("/test")
    @ResponseBody
    public DtsApiResponse testApi() {
        long took = System.currentTimeMillis();
        try {
//            List<PlayingWithNeonEntity> result = iPlayingWithNeonService.check();
            SearchDto searchDto = new SearchDto();
            searchDto.setPage(1L);
            searchDto.setSize(10L);
            List<UsersEntity> result = iPlayingWithNeonService.getAll(searchDto);
            return this.handlerSuccess(result, took);
        }catch (Exception ex) {
            logger.error(ex.getMessage());
            return this.handlerException(CommonConstant.EXCEPTION_CODE, ex.getMessage());
        }
    }
}
