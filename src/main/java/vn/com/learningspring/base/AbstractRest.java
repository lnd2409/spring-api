package vn.com.learningspring.base;

import vn.com.learningspring.common.ApiResponse;
import java.util.Objects;

public abstract class AbstractRest {
    protected <T> ApiResponse handlerSuccess(int codeStatus, String messageStatus, T data, Long took) {
        ApiResponse response = new ApiResponse();
        response.setCodeStatus(codeStatus);
        response.setMessageStatus(messageStatus);
        response.setData(data);
        response.setTook(took);
        return response;
    }
}
