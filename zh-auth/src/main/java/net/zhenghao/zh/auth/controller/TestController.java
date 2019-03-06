package net.zhenghao.zh.auth.controller;

import net.zhenghao.zh.common.jwt.JWTInfo;
import net.zhenghao.zh.common.utils.JWTTokenUtils;
import net.zhenghao.zh.common.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private JWTTokenUtils jwtTokenUtils;

    @Autowired
    private RedisUtils redisUtils;

    @GetMapping("/demo")
    public String demo() {
        return "success";
    }

    @GetMapping("/getToken")
    public String getToken() {
        return jwtTokenUtils.generateToken(new JWTInfo(1L, "admin"));
    }

    @GetMapping("/getUserInfo")
    public JWTInfo getToken(String token) {
        return jwtTokenUtils.getInfoFromToken(token);
    }

    @PostMapping("/auth")
    public String auth() {
        return "auth => success";
    }

    @GetMapping("/set")
    public String set() {
        redisUtils.set("aa", "zhaozhenghao", 300);
        return "set => success";
    }

    @GetMapping("/get")
    public String get() {
        return (String) redisUtils.get("aa");
    }
}
