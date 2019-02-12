package net.zhenghao.zh.common.runner;

import net.zhenghao.zh.common.config.KeyConfig;
import net.zhenghao.zh.common.jwt.RsaKeyHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * 🙃
 * 🙃 公钥私钥初始化赋值
 * 🙃 springboot启动时执行任务CommandLineRunner
 *
 * @author:zhaozhenghao
 * @Email :736720794@qq.com
 * @date :2019/01/18 23:54
 * AuthServerRunner.java
 */
@Configuration
public class AuthServerRunner implements CommandLineRunner {

    @Autowired
    private KeyConfig keyConfig;

    @Override
    public void run(String... args) throws Exception {
        Map<String, byte[]> keyMap = RsaKeyHelper.generateKey(keyConfig.getRsaSecret());
        keyConfig.setPubKey(keyMap.get("pub"));
        keyConfig.setPriKey(keyMap.get("pri"));

        System.out.println();
        for (int i = 0; i < keyMap.get("pub").length; i++) {
            System.out.print(keyMap.get("pub")[i]);
        }
        System.out.println();
        for (int i = 0; i < keyMap.get("pri").length; i++) {
            System.out.print(keyMap.get("pri")[i]);
        }
    }
}
