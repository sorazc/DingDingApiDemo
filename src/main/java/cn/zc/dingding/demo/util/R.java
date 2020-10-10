package cn.zc.dingding.demo.util;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @ClassName R
 * @Description
 * @Author zc
 * @Date 2020/10/10 11:31
 */
@Data
@Accessors(chain = true)
public class R<T> {

    private String code;

    private String message;

    private T data;

    public static R<Void> success() {
        return new R<Void>()
                .setCode("0")
                .setMessage("success");
    }

    public static <T> R<T> success(T data) {
        return new R<T>()
                .setCode("0")
                .setMessage("success")
                .setData(data);
    }

}
