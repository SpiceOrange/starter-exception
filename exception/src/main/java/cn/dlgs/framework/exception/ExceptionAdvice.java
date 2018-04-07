package cn.dlgs.framework.exception;

import cn.dlgs.framework.exception.model.ApplicationException;
import cn.dlgs.framework.exception.model.BusinessException;
import cn.dlgs.framework.exception.model.ExceptionResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 辣味橘子
 */
@RestControllerAdvice
@Slf4j
public class ExceptionAdvice {

    /**
     * 500 - Internal Server Error
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(BusinessException.class)
    public ExceptionResult handleServiceException(BusinessException e) {
        log.error("未处理的业务异常", e);
        return ExceptionResult.newInstance(40001, "服务运行异常:未处理的业务异常");
    }

    /**
     * 500 - Internal Server Error
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(ApplicationException.class)
    public ExceptionResult handleServiceException(ApplicationException e) {
        log.error("未处理的非业务异常", e);
        return ExceptionResult.newInstance(40002, "服务运行异常:未处理的业务异常");
    }

    /**
     * 500 - Internal Server Error
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ExceptionResult handleException(Throwable e) {
        log.error("服务器未知异常", e);
        return ExceptionResult.newInstance(40000, "服务器未知异常");
    }

}
