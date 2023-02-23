package com.han.reggie.utils;

import java.util.Random;

/**
 * 生成验证码
 */
public class ValidateCodeUtils {
    /**
     * @param length
     * @retur
     */
    public static Integer generateValidateCode(int length){
        Integer code =null;
        code = new Random().nextInt(9999);//生成随机数，最大为9999
        if(code < 1000){
            code = code + 1000;//保证随机数为4位数字
        }
        return code;
    }

}
