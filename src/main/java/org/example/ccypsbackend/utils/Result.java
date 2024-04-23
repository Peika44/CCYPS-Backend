package org.example.ccypsbackend.utils;


import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Result<T> {

    private Boolean success;
    private Integer code;
    private String message;
    private Map<String, Object> data = new HashMap<String, Object>();
    private T dataObject;

    private Result() {
        this.dataObject = null;
    }

    private Result(T dataObject) {
        this.dataObject = dataObject;
    }

    public static <T> Result<T> success() {
        Result<T> r = new Result<>();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS);
        r.setMessage("Success.");
        return r;
    }

    public static <T> Result<T> success(T dataObject){
        Result<T> r = new Result<>(dataObject);
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS);
        r.setMessage("Success.");
        return r;
    }

    public static <T> Result<T> success(T dataObject, String message){
        Result<T> r = new Result<>(dataObject);
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS);
        r.setMessage(message);
        return r;
    }

    public static <T> Result<T> error() {
        Result<T> r = new Result<>();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMessage("Error.");
        return r;
    }

    public static <T> Result<T> error(Integer code, String msg) {
        Result<T> r = new Result<>();
        r.setSuccess(false);
        r.setCode(code);
        r.setMessage(msg);
        return r;
    }



//    public Result data(String key, Object value){
//        this.data.put(key, value);
//        return this;
//    }
//
//    public Result data(Map<String, Object> map){
//        this.setData(map);
//        return this;
//    }

}

