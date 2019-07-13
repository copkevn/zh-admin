package com.zhenghao.admin.auth.dao;

import com.zhenghao.admin.auth.entity.SysRoleEntity;
import com.zhenghao.admin.common.dao.BaseMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 系统角色
 *
 * @author:zhaozhenghao
 * @Email :736720794@qq.com
 * @date :2017年12月6日 上午11:23:20
 * SysRoleMapper.java
 */
@MapperScan
@Component
public interface SysRoleMapper extends BaseMapper<SysRoleEntity> {

    /**
     * 根据用户id查询该用户的角色
     *
     * @param userId
     * @return
     */
    List<SysRoleEntity> listUserRoles(Long userId);
}