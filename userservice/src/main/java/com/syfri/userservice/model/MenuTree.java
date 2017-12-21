package com.syfri.userservice.model;

import java.io.Serializable;
import java.util.List;

public class MenuTree implements Serializable{

	private static final Long serialVersionUID = 1L;

	/*主键.*/
	private String menuid;

	/*菜单名称.*/
	private String menuname;

	/*菜单URL.*/
	private String menuurl;

	/*菜单描述.*/
	private String menuinfo;

	/*顺序.*/
	private Integer seqno;

	/*子菜单.*/
	private List<MenuTree> children;

	public String getMenuid() {
		return menuid;
	}

	public void setMenuid(String menuid) {
		this.menuid = menuid;
	}

	public String getMenuname() {
		return menuname;
	}

	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}

	public String getMenuurl() {
		return menuurl;
	}

	public void setMenuurl(String menuurl) {
		this.menuurl = menuurl;
	}

	public String getMenuinfo() {
		return menuinfo;
	}

	public void setMenuinfo(String menuinfo) {
		this.menuinfo = menuinfo;
	}

	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}

	public List<MenuTree> getChildren() {
		return children;
	}

	public void setChildren(List<MenuTree> children) {
		this.children = children;
	}
}
