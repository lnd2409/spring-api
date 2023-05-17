package vn.com.learningspring.dto.rest.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class DtsBaseResponse {
    private int resultCode;
    private String resultDescription;
    private Object data;

    public DtsBaseResponse(int resultCode, String resultDescription) {
        this.resultCode = resultCode;
        this.resultDescription = resultDescription;
    }

    public DtsBaseResponse(int resultCode, String resultDescription,Object data) {
        this.resultCode = resultCode;
        this.resultDescription = resultDescription;
        this.data = data;
    }
}
