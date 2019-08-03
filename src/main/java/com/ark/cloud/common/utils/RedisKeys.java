

package com.ark.cloud.common.utils;

/**
 * Redis所有Keys
 *
 * @author peixiuyue
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }
}
