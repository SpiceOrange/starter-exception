package cn.dlgs.framework.exception.test.exception;

import cn.dlgs.framework.exception.model.BusinessException;

/**
 * @author 辣味橘子
 */
public class MyBusinessException extends BusinessException{

    public MyBusinessException() {
        super("自定义业务异常");
    }

}
