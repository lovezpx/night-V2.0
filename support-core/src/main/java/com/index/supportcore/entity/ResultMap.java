package com.index.supportcore.entity;

import java.io.Serializable;

/**
 * @Auther: Index
 * @Date: 2018/11/28 09:40
 * @Description:
 */
public class ResultMap<T> implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private boolean status;

    private String message;

    private T data;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}