package com.youmeek.ssm.manage.vo;

public class JSONResult {
    
    private String message;
    private String result;
    private String success;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public JSONResult(String success) {
        this.success = success;
    }

    public JSONResult() {
    }

}