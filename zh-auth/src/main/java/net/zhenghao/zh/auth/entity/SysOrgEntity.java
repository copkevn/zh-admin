package net.zhenghao.zh.auth.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * 组织管理
 *
 * @author:zhaozhenghao
 * @Email :736720794@qq.com
 * @date  :2017年12月5日 下午1:09:39
 * SysMenuEntity.java
 */
public class SysOrgEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 组织ID
	 */
	private Long orgId;

	/**
	 * 父级ID,一级菜单为0
	 */
	private Long parentId;

	/**
	 * 组级列表
	 */
	private String ancestors;

	/**
	 * 菜单名称
	 */
	private String orgName;

	/**
	 * 排序
	 */
	private Integer orderNum;

	/**
	 * 创建人id
	 */
	private Long creatorId;

	/**
	 * 创建时间
	 */
	private Timestamp createTime;

	/**
	 * 最后修改人id
	 */
	private Long modifierId;

	private List<SysOrgEntity> children;

	/**
	 * 最后修改时间
	 */
	private Timestamp modifiedTime;

	public SysOrgEntity() {
		super();
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getAncestors() {
		return ancestors;
	}

	public void setAncestors(String ancestors) {
		this.ancestors = ancestors;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public Long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Long getModifierId() {
		return modifierId;
	}

	public void setModifierId(Long modifierId) {
		this.modifierId = modifierId;
	}

	public Timestamp getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public List<SysOrgEntity> getChildren() {
		return children;
	}

	public void setChildren(List<SysOrgEntity> children) {
		this.children = children;
	}
}