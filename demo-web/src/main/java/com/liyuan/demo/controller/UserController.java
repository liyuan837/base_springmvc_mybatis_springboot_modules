package com.liyuan.demo.controller;

import com.liyuan.demo.domain.po.user.UserPo;
import com.liyuan.demo.domain.condition.user.UserCondition;
import com.liyuan.demo.form.user.*;
import com.liyuan.demo.vo.user.UserVo;
import com.liyuan.demo.service.UserService;
import com.liyuan.demo.domain.exception.DemoException;
import com.liyuan.demo.controller.base.BaseController;
import com.liyuan.demo.response.ResponseEntity;
import com.liyuan.demo.response.PageListResponse;
import java.util.List;
import java.util.ArrayList;
import com.liyuan.demo.util.CopyUtil;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/user")
@Api(value = "/user", description = "")
public class UserController extends BaseController {

	@Autowired
	private UserService userService;

	@ApiOperation(value = "查询",notes = "根据ID查询",httpMethod = "GET")
	@GetMapping(value = "/query")
	public ResponseEntity<UserVo> query(@ApiParam(value = "用户表唯一id，自增", required = true)@RequestParam Integer uid) throws DemoException {
		UserPo po = userService.queryWithValid(uid);
		UserVo vo = CopyUtil.transfer(po, UserVo.class);
		return getSuccessResult(vo);
	}

	@ApiOperation(value = "查询数量",notes = "查询数量",httpMethod = "POST")
	@PostMapping(value = "/queryCount")
	public ResponseEntity<Integer> queryCount(@RequestBody@Valid UserQueryForm form) throws DemoException {
		UserCondition condition = CopyUtil.transfer(form, UserCondition.class);
		int count = userService.queryCount(condition);
		return getSuccessResult(count);
	}

	@ApiOperation(value = "查询列表",notes = "查询列表",httpMethod = "POST")
	@PostMapping(value = "/queryList")
	public ResponseEntity<PageListResponse<UserVo>> queryList(@RequestBody@Valid UserQueryForm form) throws DemoException {
		UserCondition condition = CopyUtil.transfer(form, UserCondition.class);
		List<UserPo> poList = userService.queryList(condition);
		List<UserVo> voList = CopyUtil.transfer(poList, UserVo.class);
		return getSuccessResult(voList);
	}

	@ApiOperation(value = "查询列表(带分页)",notes = "查询列表(带分页)",httpMethod = "POST")
	@PostMapping(value = "/queryPageList")
	public ResponseEntity<PageListResponse<UserVo>> queryPageList(@RequestBody@Valid UserQueryForm form) throws DemoException {
		UserCondition condition = CopyUtil.transfer(form, UserCondition.class);
		List<UserVo> voList = new ArrayList<>();
		int count = userService.queryCount(condition);
		if (count > 0) {
			List<UserPo> poList = userService.queryList(condition);
			voList = CopyUtil.transfer(poList, UserVo.class);
		}
		return getSuccessResult(getPageListResponse(condition.getPageNum(),condition.getPageSize(),count,voList));
	}

	@ApiOperation(value = "新增",notes = "新增",httpMethod = "POST")
	@PostMapping(value = "/add")
	public ResponseEntity<UserVo> add(@RequestBody@Valid UserCreateForm form) throws DemoException {
		UserPo po = CopyUtil.transfer(form, UserPo.class);
		userService.insert(po);
		UserVo vo = CopyUtil.transfer(po, UserVo.class);
		return getSuccessResult(vo);
	}

	@ApiOperation(value = "修改",notes = "修改",httpMethod = "POST")
	@PostMapping(value = "/update")
	public ResponseEntity update(@RequestBody@Valid UserUpdateForm form) throws DemoException {
		UserPo po = CopyUtil.transfer(form, UserPo.class);
		userService.update(po);
		return getSuccessResult();
	}

	@ApiOperation(value = "删除",notes = "删除",httpMethod = "POST")
	@PostMapping(value = "/delete")
	public ResponseEntity delete(@RequestBody@Valid UserDeleteForm form) throws DemoException {
		userService.delete(form.getUid());
		return getSuccessResult();
	}

	/**
	 * UserQueryForm转换为UserCondition
	 *
	 * @param form
	 * @return
	 */
	private UserCondition getConditionByQueryForm(UserQueryForm form) {
		UserCondition condition = CopyUtil.transfer(form, UserCondition.class);
		return condition;
	}

}