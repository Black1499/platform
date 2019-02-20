package com.nf147.platform.util.response;
/**
 * 封装返回对象
 *
 * @author 刘志翔
 * @date 2019/2/20
 */
public class JSONResponse<T> {
    /**
     * true代表请求成功，false代表请求失败
     */
    boolean status;
    /**
     * http状态码
     */
    int code;
    /**
     * 提示消息
     */
    String message;
    /**
     * 页码
     */
    int page;
    /**
     * 总的数据量
     */
    int count;
    /**
     * 用来存放数据
     */
    T data;
    /**
     * 详细错误信息
     */
    String error;

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

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public JSONResponse() {
    }


    public static JSONResponse jsonResponse = new JSONResponse();

    /**
     * 请求成功，没有数据返回
     * @param constants
     * @return
     */
    public static JSONResponse OK(Constants constants) {
        jsonResponse.setStatus(constants.isStatus());
        jsonResponse.setCode(constants.getCode());
        jsonResponse.setMessage(constants.getMessage());
        return jsonResponse;
    }

    /**
     * 请求成功，有数据返回
     * @param constants
     * @return
     */
    public static <T> JSONResponse OK(Constants constants, T data) {
        JSONResponse.OK(constants);
        jsonResponse.setData(data);
        return jsonResponse;
    }
    /**
     * 请求成功，有关分页的数据返回
     * @param constants
     * @return
     */
    public static <T> JSONResponse OK(Constants constants, int page, int count, T data) {
        JSONResponse.OK(constants, data);
        jsonResponse.setPage(page);
        jsonResponse.setCount(count);
        return jsonResponse;
    }
    /**
     * 请求失败，没有数据返回
     * @param constants
     * @return
     */
    public static JSONResponse ERROR(Constants constants) {
        jsonResponse.setStatus(constants.isStatus());
        jsonResponse.setCode(constants.getCode());
        jsonResponse.setMessage(constants.getMessage());
        return jsonResponse;
    }
    /**
     * 请求失败，带有详细的后台错误信息
     * @param constants
     * @return
     */
    public static JSONResponse ERROR(Constants constants, String error) {
        JSONResponse.ERROR(constants);
        jsonResponse.setError(error);
        return jsonResponse;
    }
}
