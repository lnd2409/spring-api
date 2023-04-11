package vn.com.learningspring.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import vn.com.learningspring.common.ApiResponse;


public interface IApiPlayingWithNeonRest {

    @ApiOperation("Playing With Neon" + "- list")
    @ApiResponses(value = { @io.swagger.annotations.ApiResponse(code = 200, message = "Success"),
            @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"), @io.swagger.annotations.ApiResponse(code = 402, message = "Forbidden"),
            @io.swagger.annotations.ApiResponse(code = 4022404, message = "Error not found repository"),
            @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error"), })
    public ApiResponse testApi();
}
