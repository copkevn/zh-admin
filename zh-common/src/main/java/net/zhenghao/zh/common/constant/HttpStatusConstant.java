package net.zhenghao.zh.common.constant;


/**
 * 🙃
 * 🙃 请求响应状态标识
 * 🙃
 *
 * @author:zhaozhenghao
 * @Email :736720794@qq.com
 * @date :2019/01/22 21:28
 * HttpStatusConstant.java
 */

public class HttpStatusConstant {

    private HttpStatusConstant() {
    }

    /**
     * 该用户对此api无权限
     */
    public static final int USER_API_UNAUTHORIZED = 40101;

    /**
     * 用户不存在
     */
    public static final int USER_UNKNOWN_ACCOUNT = 40102;

    /**
     * 用户密码不正确
     */
    public static final int USER_INCORRECT_CREDENTIALS = 40103;

    /**
     * 用户被锁定
     */
    public static final int USER_LOCKED_ACCOUNT = 40104;

    /**
     * 账户验证异常
     */
    public static final int USER_AUTHENTICATION_EXCEPTION = 40105;

    /**
     * token 过期
     */
    public static final int TOKEN_EXPIRED_FORBIDDEN = 40301;

    /**
     * token 签名异常
     */
    public static final int TOKEN_SIGNATURE_ERROR = 40302;

    /**
     * token 为空
     */
    public static final int TOKEN_NULL_FORBIDDEN = 40303;

    /**
     * token 其他异常
     */
    public static final int TOKEN_OTHER_EXCEPTION = 40304;

    /**
     * 请求 api 格式错误,请求无效
     */
    public static final int REQUEST_API_INVALID = 40401;

    /**
     * 请求 api 不存在
     */
    public static final int REQUEST_API_NOT_FOUND = 40402;

    /**
     * 其他异常code
     */
    public static final int EXCEPTION_OTHER_CODE = 500;
}
