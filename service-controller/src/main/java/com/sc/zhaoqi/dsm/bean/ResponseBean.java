package com.sc.zhaoqi.dsm.bean;

import java.io.Serializable;

public class ResponseBean implements Serializable
{
    private static final long serialVersionUID = 1L;

    private int status;
    private String msg;
    private Object data;

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public Object getData()
    {
        return data;
    }

    public void setData(Object data)
    {
        this.data = data;
    }

    public static ResponseBean success(String msg){
        ResponseBean okResponse = new ResponseBean();
        okResponse.setStatus(200);
        okResponse.setMsg(msg);
        return okResponse;
    }
    public static ResponseBean success(String msg,Object data){
        ResponseBean responseBean = success(msg);
        responseBean.setData(data);
        return responseBean;
    }
    public static ResponseBean fail(String msg){
        ResponseBean failResponse = new ResponseBean();
        failResponse.setStatus(500);
        failResponse.setMsg(msg);
        return failResponse;
    }
    public static ResponseBean fail(String msg,Object data){
        ResponseBean responseBean = fail(msg);
        responseBean.setData(data);
        return responseBean;
    }
}
