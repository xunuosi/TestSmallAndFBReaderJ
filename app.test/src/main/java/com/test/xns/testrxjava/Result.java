package com.test.xns.testrxjava;

/**
 * 服务器返回结果的实体类
 */

public class Result {
    private int resCode;
    private boolean isSuccess;
    private Object retData;

    public Result() {
    }

    public Result(int resCode, boolean isSuccess, Object retData) {
        this.resCode = resCode;
        this.isSuccess = isSuccess;
        this.retData = retData;
    }

    public int getResCode() {
        return resCode;
    }

    public void setResCode(int resCode) {
        this.resCode = resCode;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public Object getRetData() {
        return retData;
    }

    public void setRetData(Object retData) {
        this.retData = retData;
    }

    @Override
    public String toString() {
        return "Result{" +
                "resCode=" + resCode +
                ", isSuccess=" + isSuccess +
                ", retData=" + retData +
                '}';
    }
}
