package cwl.kill.api.response;

import cwl.kill.api.enums.StatusCode;

/**
 * @Author long
 * @Date 2020/3/8 14:25
 */
public class BaseResponse<T> {
    private Integer code;
    private String msg;
    private T data;

    public BaseResponse(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }
    public BaseResponse(Integer code,String msg,T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public BaseResponse(StatusCode statusCode){
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
