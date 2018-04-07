package cn.dlgs.framework.exception.model;

/**
 * 业务异常
 *
 * @author 辣味橘子
 */
public class BusinessException extends Exception
{
    private static final long serialVersionUID = -893543915041247854L;

    public BusinessException() {
        super();
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

}