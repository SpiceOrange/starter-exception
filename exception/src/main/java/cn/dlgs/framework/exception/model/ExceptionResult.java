package cn.dlgs.framework.exception.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 辣味橘子
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResult {

    private int code;

    private String message;

    public static ExceptionResult newInstance(int code, String message) {
        return new ExceptionResult(code, message);
    }

}
