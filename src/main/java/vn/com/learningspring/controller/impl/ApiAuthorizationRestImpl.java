package vn.com.learningspring.controller.impl;

import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import vn.com.learningspring.base.AbstractRest;
import vn.com.learningspring.controller.IApiAuthorizationRest;


@RestController
@Api(tags = "Authorization")
public class ApiAuthorizationRestImpl extends AbstractRest implements IApiAuthorizationRest {

    @PostMapping
    @ResponseBody

    @Override
    public ResponseEntity<?> registerUser() {

        return null;
    }
}
