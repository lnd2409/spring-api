package vn.com.learningspring.controller;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import vn.com.learningspring.dto.rest.common.DtsApiResponse;

public interface IApiPlayingWithNeonRest {

    @ApiOperation("Playing With Neon" + "- list")
    @ApiResponses(value = { @io.swagger.annotations.ApiResponse(code = 200, message = "Success"),
            @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
            @io.swagger.annotations.ApiResponse(code = 402, message = "Forbidden"),
            @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error"), })
    DtsApiResponse testApi();
}
