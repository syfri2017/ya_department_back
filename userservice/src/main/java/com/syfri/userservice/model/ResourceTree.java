package com.syfri.userservice.model;

import java.io.Serializable;
import java.util.List;

public class ResourceTree implements Serializable{

	private static final Long serialVersionUID = 1L;

	/*主键.*/
	private String resourceid;

	/*资源名称.*/
	private String resourcename;

	/*资源描述.*/
	private String resourceinfo;

	/*菜单URL.*/
	private String url;

	/*顺序.*/
	private Integer seqno;

	/*索引.*/
	private String index;

	/*图标.*/
	private String icon;

	/*资源类型.*/
	private String type;

	/*parentId.*/
	private String parentId;

	/*子资源.*/
	private List<ResourceTree> children;

	public ResourceTree() {
	}

	public ResourceTree(String resourceid, String url, String resourceinfo, String icon, String parentId) {
		this.resourceid = resourceid;
		this.url = url;
		this.resourceinfo = resourceinfo;
		this.icon = icon;
		this.parentId = parentId;
	}

	public String getResourceid() {
		return resourceid;
	}

	public void setResourceid(String resourceid) {
		this.resourceid = resourceid;
	}

	public String getResourcename() {
		return resourcename;
	}

	public void setResourcename(String resourcename) {
		this.resourcename = resourcename;
	}

	public String getResourceinfo() {
		return resourceinfo;
	}

	public void setResourceinfo(String resourceinfo) {
		this.resourceinfo = resourceinfo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public List<ResourceTree> getChildren() {
		return children;
	}

	public void setChildren(List<ResourceTree> children) {
		this.children = children;
	}
}
