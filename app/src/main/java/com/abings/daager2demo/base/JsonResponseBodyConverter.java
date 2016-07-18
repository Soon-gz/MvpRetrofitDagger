package com.abings.daager2demo.base;

import com.squareup.okhttp.ResponseBody;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import retrofit.Converter;

final class JsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    JsonResponseBodyConverter() {
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        JSONObject jsonObj;
        try {
            jsonObj = new JSONObject(value.string());
            return (T) jsonObj;
        } catch (JSONException e) {
            return null;
        }
    }
}