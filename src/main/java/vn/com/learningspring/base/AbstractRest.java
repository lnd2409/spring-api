package vn.com.learningspring.base;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import vn.com.learningspring.constants.DtsConstant;
import vn.com.learningspring.dto.rest.common.DtsApiResponse;

import java.util.Locale;
import java.util.Optional;

public abstract class AbstractRest {

    public DtsApiResponse handlerSuccess(Object data, long start) {
        long took = System.currentTimeMillis() - start;
        return new DtsApiResponse(DtsConstant.SUCCESS_CODE, DtsConstant.SUCCESS, "", took, data);
    }

    public DtsApiResponse handlerException(int codeStatus, String message) {
        return new DtsApiResponse(codeStatus, message, null, 0);
    }
}
