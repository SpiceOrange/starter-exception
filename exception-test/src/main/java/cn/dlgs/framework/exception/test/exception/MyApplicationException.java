package cn.dlgs.framework.exception.test.exception;

import cn.dlgs.framework.exception.model.ApplicationException;

/**
 * @author 辣味橘子
 */
public class MyApplicationException extends ApplicationException {

    public MyApplicationException() {
        super("自定义非业务异常");
    }

}
