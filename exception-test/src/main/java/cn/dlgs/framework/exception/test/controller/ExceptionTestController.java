package cn.dlgs.framework.exception.test.controller;

import cn.dlgs.framework.exception.model.ApplicationException;
import cn.dlgs.framework.exception.model.BusinessException;
import cn.dlgs.framework.exception.model.ExceptionResult;
import cn.dlgs.framework.exception.test.exception.MyApplicationException;
import cn.dlgs.framework.exception.test.exception.MyBusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 辣味橘子
 */
@Slf4j
@RestController
@RequestMapping(value = "/exception-test")
public class ExceptionTestController {

    @GetMapping(value = "/catch-biz-exception")
    public Object testAndCatchBusinessException() {
        try {
            throw new MyBusinessException();
        } catch (BusinessException e) {
            log.error("发生了业务异常", e);
            return ExceptionResult.newInstance(40001, "发生了业务异常，但是已经被捕获");
        }
    }

    @GetMapping(value = "/catch-app-exception")
    public Object testAndCatchApplicationException() {
        try {
            throw new MyApplicationException();
        } catch (ApplicationException e) {
            log.error("发生了非业务异常", e);
            return ExceptionResult.newInstance(40001, "发生了非业务异常，但是已经被捕获");
        }
    }

    @GetMapping(value = "/miss-biz-exception")
    public void testAndMisshBusinessException() throws Exception {
        log.error("Controller中直接抛出异常是绝对禁止的，还好可以在外部截获");
        throw new MyBusinessException();
    }

    @GetMapping(value = "/miss-app-exception")
    public void testAndMissApplicationException() throws Exception {
        log.error("Controller中直接抛出异常是绝对禁止的，还好可以在外部截获");
        throw new MyApplicationException();
    }
}
