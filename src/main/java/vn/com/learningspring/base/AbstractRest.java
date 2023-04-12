package vn.com.learningspring.base;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import vn.com.learningspring.common.ApiResponse;
import java.util.Objects;

public abstract class AbstractRest {
    protected <T> ResponseEntity<?> handlerSuccess(int codeStatus, String messageStatus, T data, Long took) {
        ApiResponse response = new ApiResponse();
        response.setCodeStatus(codeStatus);
        response.setMessageStatus(messageStatus);
        response.setData(data);
        response.setTook(System.currentTimeMillis() - took);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    protected ResponseEntity<?> handlerException(int codeStatus, String messageStatus, String exMsg, Long took) {
        ApiResponse response = new ApiResponse();
        response.setCodeStatus(codeStatus);
        response.setMessageStatus(messageStatus);
        response.setDescription(exMsg);
        response.setTook(System.currentTimeMillis() - took);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
