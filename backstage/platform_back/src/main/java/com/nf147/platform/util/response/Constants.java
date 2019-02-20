package com.nf147.platform.util.response;

/**
 * 枚举类，存放http状态码，以及相关信息
 *
 * @author 刘志翔
 * @date 2019/2/19
 */
public enum Constants {

    SUCCESS_200(true, 200, "请求成功"),
    SUCCESS_202(true, 202, "未处理"),
    SUCCESS_203(true, 203, "非授权信息"),
    SUCCESS_204(true, 204, "无数据"),
    ERROR_400(false, 400, "请求语法错误"),
    ERROR_401(false, 401, "未登录"),
    ERROR_403(false, 403, "服务器禁止请求"),
    ERROR_404(false, 404, "找不到的页面"),
    ERROR_408(false, 408, "请求超时"),
    ERROR_500(false, 500, "服务器错误");


    boolean status;
    int code;
    String message;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    Constants(boolean status, int code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
