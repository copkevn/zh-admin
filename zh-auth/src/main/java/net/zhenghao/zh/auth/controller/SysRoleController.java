package net.zhenghao.zh.auth.controller;

import net.zhenghao.zh.common.annotation.SysLog;
import net.zhenghao.zh.common.constant.SystemConstant;
import net.zhenghao.zh.common.controller.AbstractController;
import net.zhenghao.zh.common.entity.Page;
import net.zhenghao.zh.common.entity.R;
import net.zhenghao.zh.auth.entity.SysRoleEntity;
import net.zhenghao.zh.auth.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 系统角色controller
 *
 * @author:zhaozhenghao
 * @Email :736720794@qq.com
 * @date  :2019年2月17日 下午2:48:50
 * SysRoleController.java
 */
@RestController
@RequestMapping("/sys/role")
public class SysRoleController extends AbstractController {

	@Autowired
	private SysRoleService sysRoleService;
	
	@GetMapping("")
	public Page<SysRoleEntity> list(@RequestParam Map<String, Object> params) {
		if (getUserId() != SystemConstant.SUPER_ADMIN) {
			params.put("creatorId", getUserId());
		}
		return sysRoleService.listRole(params);
	}

	/**
	 * 根据id查询详情
	 * @param roleId
	 * @return
	 */
	@GetMapping("/{id}")
	public R info(@PathVariable("id") Long roleId) {
		return sysRoleService.getRoleById(roleId);
	}
	
	/**
	 * 角色list
	 * @return
	 */
	@GetMapping("/select")
	public R listRole() {
		return sysRoleService.listRole();
	}
	
	/**
	 * 新增角色
	 * @param role
	 * @return
	 */
	@SysLog("新增角色")
	@PostMapping("")
	public R saveRole(@RequestBody SysRoleEntity role) {
		role.setCreatorId(getUserId());
		return sysRoleService.saveRole(role);
	}
	
	/**
	 * 修改角色
	 * @param role
	 * @return
	 */
	@SysLog("修改角色")
	@PutMapping("/{id}")
	public R updateRole(@PathVariable("id") Long roleId, @RequestBody SysRoleEntity role) {
		role.setRoleId(roleId);
		role.setModifierId(getUserId());
		return sysRoleService.updateRole(role);
	}

	/**
	 * 删除
	 * @param roleId
	 * @return
	 */
	@SysLog("删除角色")
	@DeleteMapping("/{id}")
	public R remove(@PathVariable("id") Long roleId) {
		return sysRoleService.removeRole(roleId);
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@SysLog("删除角色")
	@DeleteMapping("")
	public R batchRemove(@RequestBody Long[] ids) {
		return sysRoleService.batchRemove(ids);
	}
	
	/**
	 * 分配权限
	 * @param roleId
	 * @param menuIdList
	 * @return
	 */
	@SysLog(value = "分配权限", type = SystemConstant.LogType.AUTHORIZATION)
	@PutMapping("/{id}/authorize")
	public R updateRoleAuthorization(@PathVariable("id") Long roleId, @RequestBody List<Long> menuIdList) {
		return sysRoleService.updateRoleAuthorization(roleId, menuIdList);
	}
}
