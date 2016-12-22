package com.bluedon.elsearch.util;

import com.google.gson.Gson;

/**
 * Created by 徐洋洋 on 2016/12/19.
 */
public class GsonUtil {
    private static Gson gson = new Gson();
    public static String toJson(Object object){
        return gson.toJson(object);
    }
    public static <T> T fromJson(String json,Class<T> clazz){
        return gson.fromJson(json,clazz);
    }
 }
