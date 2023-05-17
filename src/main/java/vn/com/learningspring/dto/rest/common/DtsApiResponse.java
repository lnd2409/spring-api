package vn.com.learningspring.dto.rest.common;

import lombok.Data;
import vn.com.learningspring.constants.DtsConstant;
import vn.com.learningspring.enumdef.ErrorHint;

import java.util.Date;
@Data
public class DtsApiResponse extends DtsBaseResponse{
    private static final long serialVersionUID = -2080447665304438927L;

    private String time;

    private int codeStatus;

    private String messageStatus;

    private ErrorHint errorHint;

    private ErrorHint hint;

    private String description;

    private String hiddenDesc;

    private long took;

    private Object data;

    public DtsApiResponse() {
        // TODO Auto-generated constructor stub
    }

    /**
     * Constructor for case Fail.
     *
     * @param codeStatus
     * @param messageStatus
     * @param description
     * @param took
     */
    public DtsApiResponse(int codeStatus, String messageStatus, String description, long took) {
        super(codeStatus, messageStatus, null);
        this.codeStatus = codeStatus;
        this.messageStatus = messageStatus;
        this.description = description;
        this.took = took;
        this.time = new Date().toString();
        this.setResultCode(DtsConstant.RESULT_CODE_SYSTEM_ERROR);
        this.setResultDescription(description);
    }


    /**
     * Constructor for case Fail.
     *
     * @param codeStatus
     * @param messageStatus
     * @param description
     * @param took
     */
    public DtsApiResponse(int codeStatus, String messageStatus, ErrorHint errorHint, String description, long took) {
        super(codeStatus, messageStatus, null);
        this.codeStatus = codeStatus;
        this.messageStatus = messageStatus;
        this.errorHint = errorHint;
        this.description = description;
        this.took = took;
        this.time = new Date().toString();
        this.setResultCode(DtsConstant.RESULT_CODE_SYSTEM_ERROR);
        this.setResultDescription(description);
    }

    /**
     * Constructor for case Success.
     *
     * @param codeStatus
     * @param messageStatus
     * @param description
     * @param took
     * @param data
     */
    public DtsApiResponse(int codeStatus, String messageStatus, String description, long took, Object data) {
        super(codeStatus, messageStatus);
        this.codeStatus = codeStatus;
        this.messageStatus = messageStatus;
        this.description = description;
        this.took = took;
        this.data = data;
        this.time = new Date().toString();
        this.setResultCode(0);
        this.setResultDescription(DtsConstant.SUCCESS);
    }

    /**
     * Constructor for case Success.
     *
     * @param codeStatus
     * @param messageStatus
     * @param errorHint
     * @param description
     * @param took
     * @param data
     */
    public DtsApiResponse(int codeStatus, String messageStatus, ErrorHint errorHint, String description, long took, Object data) {
        super(codeStatus, messageStatus);
        this.codeStatus = codeStatus;
        this.messageStatus = messageStatus;
        this.errorHint = errorHint;
        this.description = description;
        this.took = took;
        this.data = data;
        this.time = new Date().toString();
        this.setResultCode(0);
        this.setResultDescription(DtsConstant.SUCCESS);
    }

    public DtsApiResponse(int codeStatus, String messageStatus, ErrorHint hint, String description, Object data) {
        super(codeStatus, messageStatus);
        this.codeStatus = codeStatus;
        this.messageStatus = messageStatus;
        this.hint = hint;
        this.description = description;
        this.data = data;
        this.time = new Date().toString();
        this.setResultCode(0);
        this.setResultDescription(messageStatus);
    }

    /**
     * Constructor for case Fail.
     *
     * @param codeStatus
     * @param messageStatus
     * @param description
     * @param took
     */
    public DtsApiResponse(int codeStatus, String messageStatus, String description, String hiddenDesc, long took) {
        super(codeStatus, messageStatus, null);
        this.codeStatus = codeStatus;
        this.messageStatus = messageStatus;
        this.description = description;
        this.hiddenDesc = hiddenDesc;
        this.took = took;
        this.time = new Date().toString();
        this.setResultCode(DtsConstant.RESULT_CODE_SYSTEM_ERROR);
        this.setResultDescription(description);
    }

    public DtsApiResponse(int codeStatus, String messageStatus, ErrorHint hint, String description, Object data,int setResultCode) {
        super(codeStatus, messageStatus);
        this.codeStatus = codeStatus;
        this.messageStatus = messageStatus;
        this.hint = hint;
        this.description = description;
        this.data = data;
        this.time = new Date().toString();
        this.setResultCode(setResultCode);
        this.setResultDescription(description);
    }
}
