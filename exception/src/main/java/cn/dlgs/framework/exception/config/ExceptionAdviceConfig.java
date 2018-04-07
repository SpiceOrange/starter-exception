package cn.dlgs.framework.exception.config;

import cn.dlgs.framework.exception.ExceptionAdvice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 辣味橘子
 */
@Configuration
public class ExceptionAdviceConfig {

    @Bean
    public ExceptionAdvice getExceptionAdvice() {
        return new ExceptionAdvice();
    }
}
