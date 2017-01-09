package com.bluedon.elsearch.util;

import com.google.gson.Gson;

/**
 * json转换工具类
 * Created by 徐洋洋 on 2016/12/19.
 */
public class GsonUtil {
    private static Gson gson = new Gson();

    /**
     * 将对象转换为json字符串
     * @param object
     * @return String
     */
    public static String toJson(Object object){
        return gson.toJson(object);
    }

    /**
     * 将json字符串反序列化成对象
     * @param json
     * @param clazz
     * @return T
     */
    public static <T> T fromJson(String json,Class<T> clazz){
        return gson.fromJson(json,clazz);
    }
 }
