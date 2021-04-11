package com.lxt.annontationtest.annot;

import java.lang.annotation.*;

/**
 * @description: 用于标记属性内容为图片url的字段。摆渡时会将图片下载，并把字段值替换为图片名称；解析时会重新上传云存储，替换为新的url。
 * @author liuxutao
 * @date 2021/4/1120:51
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
@Inherited
public @interface PicFtp {

}
