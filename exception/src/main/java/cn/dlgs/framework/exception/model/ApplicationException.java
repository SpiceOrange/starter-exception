package cn.dlgs.framework.exception.model;

/**
 * 非业务异常
 *
 * @author 辣味橘子
 */
public class ApplicationException  extends Exception {

    private static final long serialVersionUID = 993543915041247854L;

    public ApplicationException() {
        super();
    }

    public ApplicationException(Throwable cause) {
        super(cause);
    }

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

}