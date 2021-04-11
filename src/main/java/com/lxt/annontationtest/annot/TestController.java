package com.lxt.annontationtest.annot;


import java.lang.reflect.Field;

/**
 * @author liuxutao
 * @description: TODO
 * @date 2021/4/1121:07
 */
public class TestController {

    public static void main(String[] args) throws IllegalAccessException {
        MsgDTO msg = new MsgDTO();
        msg.setName("lxt");
        msg.setUrl("https://gimg2.baidu.com/image_search/src=http%3A%2F%2F00.minipic.eastday.com%2F20170308%2F20170308113153_8580c2031d77a8fcedaae6e34aa8780e_9.jpeg&refer=http%3A%2F%2F00.minipic.eastday.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1620739264&t=9f07cb9df1300943fc1ea472e10bfede");

        toFtp(msg);
    }

    private static void toFtp(MsgDTO msg) throws IllegalAccessException {
        Field[] fields = msg.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(PicFtp.class)) {
                if (!field.isAccessible()) {
                    field.setAccessible(true);//设置为可访问
                }
                String url = (String) field.get(msg);
                System.out.println(field.getName() + ":" + url);
                field.set(msg, "uuid-pic");
            }
        }

        System.out.println(msg);
    }

}
