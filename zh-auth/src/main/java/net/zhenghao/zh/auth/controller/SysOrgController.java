package net.zhenghao.zh.auth.controller;

import net.zhenghao.zh.auth.entity.SysOrgEntity;
import net.zhenghao.zh.auth.service.SysOrgService;
import net.zhenghao.zh.common.annotation.SysLog;
import net.zhenghao.zh.common.controller.AbstractController;
import net.zhenghao.zh.common.entity.Page;
import net.zhenghao.zh.common.entity.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 系统组织controller
 *
 * @author:zhaozhenghao
 * @Email :736720794@qq.com
 * @date  :2017年12月8日 下午2:03:22
 * SysMenuController.java
 */
@RestController
@RequestMapping("/sys/org")
public class SysOrgController extends AbstractController {

	@Resource
	private SysOrgService sysOrgService;

	/**
	 * 组织列表
	 * @param params
	 * @return
	 */
	@GetMapping("")
	public Page<SysOrgEntity> listOrg(@RequestParam Map<String, Object> params) {
		return sysOrgService.listOrg(params);
	}

	/**
	 * 查询详情
	 * @param orgId
	 * @return
	 */
	@GetMapping("/{id}")
	public R info(@PathVariable("id") Long orgId) {
		return sysOrgService.getOrgById(orgId);
	}
	
	/**
	 * 组织树
	 * @return
	 */
	@GetMapping("/tree")
	public R select(@RequestParam Map<String, Object> params) {
		return sysOrgService.listTree();
	}
	
	/**
	 * 新增组织
	 * @param org
	 * @return
	 */
	@SysLog("新增组织")
	@PostMapping("")
	public R save(@RequestBody SysOrgEntity org) {
		org.setCreatorId(getUserId());
		return sysOrgService.saveOrg(org);
	}

	/**
	 * 修改组织
	 * @param org
	 * @return
	 */
	@SysLog("修改组织")
	@PutMapping("/{id}")
	public R update(@PathVariable("id") Long orgId, @RequestBody SysOrgEntity org) {
		org.setOrgId(orgId);
		org.setModifierId(getUserId());
		return sysOrgService.updateOrg(org);
	}
	
	/**
	 * 删除组织
	 * @param orgId
	 * @return
	 */
	@SysLog("删除组织")
	@DeleteMapping("/{id}")
	public R remove(@PathVariable("id") Long orgId) {
		return sysOrgService.remove(orgId);
	}
}