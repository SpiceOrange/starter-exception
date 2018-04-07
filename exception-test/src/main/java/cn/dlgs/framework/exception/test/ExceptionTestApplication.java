package cn.dlgs.framework.exception.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 辣味橘子
 */
@SpringBootApplication
@Slf4j
public class ExceptionTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExceptionTestApplication.class, args);
        log.info("========== Safencryption service started ==========");
    }
}
