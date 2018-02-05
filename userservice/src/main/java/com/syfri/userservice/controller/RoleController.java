package com.syfri.userservice.controller;

import com.syfri.baseapi.model.ResultVO;
import com.syfri.baseapi.utils.EConstants;
import com.syfri.userservice.model.ShiroUser;
import com.syfri.userservice.utils.CurrentUserUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.syfri.userservice.model.RoleVO;
import com.syfri.userservice.service.RoleService;
import com.syfri.baseapi.controller.BaseController;

@Api(value = "角色管理",tags = "角色管理API",description = "角色管理")
@Controller
@RequestMapping("role")
public class RoleController  extends BaseController<RoleVO>{

	@Autowired
	protected Environment environment;

	@Autowired
	private RoleService roleService;

	@Override
	public RoleService getBaseService() {
		return this.roleService;
	}

	@ModelAttribute
	public void Model(Model model){
		if (environment.containsProperty("server.context-path")) {
			model.addAttribute("contextPath", environment.getProperty("server.context-path"));
		}else{
			model.addAttribute("contextPath", "/");
		}
	}

	@GetMapping("")
	public String user(Model model){
		ShiroUser user = CurrentUserUtil.getCurrentUser();
		model.addAttribute("user", user);
		model.addAttribute("menu", user.getMenuTrees());
		return "userAdd";
	}

	/**
	 * 根据角色获取资源信息
	 */
	@ApiOperation(value="根据角色查询角色及其资源信息",notes="列表信息")
	@ApiImplicitParam(name="vo",value="角色对象")
	@RequiresPermissions("role:list")
	@GetMapping("/listByRole")
	public @ResponseBody ResultVO listByRole(RoleVO roleVO){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(roleService.doFindRoleResources(roleVO));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	/**
	 * 新增角色，同时新增其资源信息
	 */
	@ApiOperation(value="根据角色新增角色及其资源信息",notes="新增")
	@ApiImplicitParam(name="vo",value="角色对象")
	@RequiresPermissions("role:add")
	@PostMapping("/insertByRole")
	public @ResponseBody ResultVO insertByRole(RoleVO roleVO){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(roleService.doInsertRoleResources(roleVO));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	/**
	 * 修改角色，同时修改其资源信息
	 */
	@ApiOperation(value="根据角色修改角色及其资源信息",notes="修改")
	@ApiImplicitParam(name="vo",value="角色对象")
	@RequiresPermissions("role:update")
	@PostMapping("/updateByRole")
	public @ResponseBody ResultVO updateByRole(RoleVO roleVO){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(roleService.doUpdateRoleResources(roleVO));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	/**
	 * 删除角色，同时删除其资源信息
	 */
	@ApiOperation(value="根据主键删除角色角色及其资源信息",notes="删除")
	@ApiImplicitParam(name="id",value="角色主键")
	@RequiresPermissions("role:delete")
	@PostMapping("/deleteById")
	public @ResponseBody ResultVO deleteById(String roleid){
		ResultVO resultVO = ResultVO.build();
		try{
			roleService.doDeleteRole(roleid);
			resultVO.setMsg("删除成功");
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	@ApiOperation(value="获取所有的角色",notes="查询")
	@GetMapping("/getAll")
	public @ResponseBody ResultVO findAll(){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(roleService.doFindAll());
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}

	@ApiOperation(value="根据用户ID查询其角色",notes="查询")
	@ApiImplicitParam(name="id",value="用户ID")
	@GetMapping("/getRole/{userid}")
	public @ResponseBody ResultVO getRole(@PathVariable String userid){
		ResultVO resultVO = ResultVO.build();
		try{
			resultVO.setResult(roleService.doFindRoleByUserid(userid));
		}catch(Exception e){
			logger.error("{}",e.getMessage());
			resultVO.setCode(EConstants.CODE.FAILURE);
		}
		return resultVO;
	}
}
