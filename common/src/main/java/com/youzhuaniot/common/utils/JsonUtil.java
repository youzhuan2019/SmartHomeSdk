package com.youzhuaniot.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.google.gson.Gson;


public final class JsonUtil {
	private JsonUtil(){}

	private static Gson gson = new Gson();

	public static String toJson(Object obj){
		return gson.toJson(obj);
	}

	public static <T> T fromJson(String json,Class<T> beanClass){
		return JSON.parseObject(json,beanClass);
	}

	public static <T> T fromJson(String json,TypeReference typeReference){
		return (T) JSON.parseObject(json,typeReference);
	}



}
