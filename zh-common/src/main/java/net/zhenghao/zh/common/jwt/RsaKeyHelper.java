package net.zhenghao.zh.common.jwt;

import sun.misc.BASE64Decoder;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

/**
 * 🙃
 * 🙃 RsaKey密钥辅助类
 * 🙃
 *
 * @author:zhaozhenghao
 * @Email :736720794@qq.com
 * @date :2019/01/14 22:58
 * RsaKeyHelper.java
 */

public class RsaKeyHelper {

    /**
     * 加载公钥
     *
     * @param filename
     * @return
     * @throws Exception
     */
    public PublicKey loadPublicKey(String filename) throws Exception {
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream(filename);
        byte[] bytes = new byte[0];
        bytes = new byte[resourceAsStream.available()];
        resourceAsStream.read(bytes);
        BASE64Decoder base64Decoder= new BASE64Decoder();
        byte[] buffer= base64Decoder.decodeBuffer(new String(bytes));
        X509EncodedKeySpec spec = new X509EncodedKeySpec(buffer);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePublic(spec);
    }

    /**
     * 加载密钥
     *
     * @param filename
     * @return
     * @throws Exception
     */
    public PrivateKey loadPrivateKey(String filename) throws Exception {
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream(filename);
        byte[] bytes = new byte[0];
        bytes = new byte[resourceAsStream.available()];
        resourceAsStream.read(bytes);
        BASE64Decoder base64Decoder= new BASE64Decoder();
        byte[] buffer= base64Decoder.decodeBuffer(new String(bytes));
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(buffer);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePrivate(spec);
    }
}
