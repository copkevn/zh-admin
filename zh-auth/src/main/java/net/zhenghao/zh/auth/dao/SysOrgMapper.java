package net.zhenghao.zh.auth.dao;

import net.zhenghao.zh.auth.entity.SysOrgEntity;
import net.zhenghao.zh.auth.vo.SysTreeVO;
import net.zhenghao.zh.common.dao.BaseMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 系统菜单dao
 *
 * @author:zhaozhenghao
 * @Email :736720794@qq.com
 * @date  :2017年12月6日 下午1:28:55
 * SysMenuMapper.java
 */
@MapperScan
@Component
public interface SysOrgMapper extends BaseMapper<SysOrgEntity>{

	/**
	 * 得到Tree列表
	 * @return
	 */
	List<SysTreeVO> listTree();

	/**
	 * 根据menuId获取子菜单的数量
	 * @return
	 */
	int getChildCountByOrgId(Long orgId);
	
}
