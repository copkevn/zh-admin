package net.zhenghao.zh.auth.vo;

import java.io.Serializable;

/**
 * 🙃
 * 🙃 修改当前password封装vo类
 * 🙃
 *
 * @author:zhaozhenghao
 * @Email :736720794@qq.com
 * @date :2019/03/30 23:15
 * SysUserPasswordVO.java
 */

public class SysUserPasswordVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 老密码
     */
    private String oldPassword;

    /**
     * 新密码
     */
    private String password;

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
