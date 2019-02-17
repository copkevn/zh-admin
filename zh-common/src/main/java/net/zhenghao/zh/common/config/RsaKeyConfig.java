package net.zhenghao.zh.common.config;

import net.zhenghao.zh.common.jwt.RsaKeyHelper;
import net.zhenghao.zh.common.jwt.RsaKeyManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * 🙃
 * 🙃 RSA 公钥密钥配置
 * 🙃
 *
 * @author:zhaozhenghao
 * @Email :736720794@qq.com
 * @date :2019/01/18 23:51
 * KeyConfig.java
 */

@Configuration
public class RsaKeyConfig {

    @Value("${zh-admin.jwt.private-key-path}")
    private String privateKeyPath;

    @Value("${zh-admin.jwt.public-key-path}")
    private String publicKeyPath;

    @Bean
    public RsaKeyManager getRsaKeyManager() throws Exception {
        RsaKeyHelper rsaKeyHelper = new RsaKeyHelper();
        RsaKeyManager rsaKeyManager = new RsaKeyManager();
        rsaKeyManager.setPublicKey(rsaKeyHelper.loadPublicKey(publicKeyPath));
        rsaKeyManager.setPrivateKey(rsaKeyHelper.loadPrivateKey(privateKeyPath));
        return rsaKeyManager;
    }
}