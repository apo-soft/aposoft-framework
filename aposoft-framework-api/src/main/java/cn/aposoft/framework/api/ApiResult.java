/**
 * 
 */
package cn.aposoft.framework.api;

import java.io.Serializable;

/**
 * Rest或dubbo等RPC接口返回对象通用格式
 * 
 * @author Jann Liu
 * @since 1.0
 */
public interface ApiResult<T> extends Serializable {
	/**
	 * 标准成功结果
	 */
	public static final int SUCCESS = 0;
	public static final String SUCCESS_MESSAGE = "OK";
	/**
	 * 通用错误返回值结果
	 */
	public static final int ERROR = -1;
	public static final String ERROR_MESSAGE = "ERROR";
	/**
	 * 传入参数错误标准返回值
	 */
	public static final int ILLEGAL_REQUEST_PARAM_ERROR = -2;
	public static final String ILLEGAL_REQUEST_PARAM_ERROR_MESSAGE = "ILLEGAL_REQUEST_PARAM_ERROR";

	/**
	 * 
	 * @return 返回值通用编码
	 */
	int getCode();

	/**
	 * 
	 * @return 返回值标准格式
	 */
	String getMsg();

	/**
	 * 
	 * @return Payload
	 */
	T getData();
}
