package com.example.logindemospringboot_version.common;

public class Result {
    private boolean flag;
    private Object data;

    public static Result success(Object data){
        Result r = new Result();
        r.flag = true;
        r.data = data;
        return r;
    }

    public static Result fail(){
        Result r = new Result();
        r.flag = false;
        return r;
    }

    public boolean isFlag() {return flag;}
    public void setFlag(boolean flag) {this.flag = flag;}
    public Object getData() {return data;}
    public void setData(Object data) {this.data = data;}
}