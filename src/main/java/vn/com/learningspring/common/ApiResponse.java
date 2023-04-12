package vn.com.learningspring.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse {
//    private String time;

    private int codeStatus;

    private String messageStatus;

    private String description;

//    private String hiddenDesc;

    private long took;

    private Object data;
}
