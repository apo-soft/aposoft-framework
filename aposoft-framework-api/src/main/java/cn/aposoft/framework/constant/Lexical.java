/**
 *   Copyright  :  www.aposoft.cn
 */
package cn.aposoft.framework.constant;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * 通用词汇常量
 * 
 * @author Jann Liu
 * @since 1.0
 */
public class Lexical {
	private Lexical() {
	}

	/**
	 * UTF-8 Character encoding
	 * use {@code StandardCharsets.UTF_8} instead
	 * @deprecated 
	 */
	public static final Charset UTF8_CHARSET = StandardCharsets.UTF_8;
	/**
	 * UTF-8
	 */
	public static final String UTF8 = UTF8_CHARSET.displayName();
	/**
	 * JSON : "json"
	 */
	public static final String JSON = "json";
}
