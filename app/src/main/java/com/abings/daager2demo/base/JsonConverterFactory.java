package com.abings.daager2demo.base;

import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.ResponseBody;

import org.json.JSONObject;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import retrofit.Converter;

public class JsonConverterFactory extends Converter.Factory {
    public static JsonConverterFactory create() {
        return new JsonConverterFactory();
    }

    public Converter<ResponseBody, ?> fromResponseBody(Type type, Annotation[] annotations) {
        if (JSONObject.class.equals(type)) {
            return new JsonResponseBodyConverter<JSONObject>();
        }
        return null;
    }

    public Converter<?, RequestBody> toRequestBody(Type type, Annotation[] annotations) {
        if (JSONObject.class.equals(type)) {
            return new JsonRequestBodyConverter<JSONObject>();
        }
        return null;
    }
}