package com.lxt.annontationtest.annot;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author liuxutao
 * @description: TODO
 * @date 2021/4/1121:03
 */
@Data
public class MsgDTO {

    private String name;

    @PicFtp
    private String url;

}
