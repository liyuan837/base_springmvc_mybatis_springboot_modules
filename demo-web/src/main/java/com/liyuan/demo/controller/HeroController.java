package com.liyuan.demo.controller;

import com.liyuan.demo.controller.base.BaseController;
import com.liyuan.demo.domain.condition.hero.HeroCondition;
import com.liyuan.demo.domain.exception.DemoException;
import com.liyuan.demo.domain.po.hero.HeroPo;
import com.liyuan.demo.form.hero.HeroCreateForm;
import com.liyuan.demo.form.hero.HeroDeleteForm;
import com.liyuan.demo.form.hero.HeroQueryForm;
import com.liyuan.demo.form.hero.HeroUpdateForm;
import com.liyuan.demo.response.ResponseEntity;
import com.liyuan.demo.service.HeroService;
import com.liyuan.demo.utils.CopyUtil;
import com.liyuan.demo.vo.hero.HeroVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/Hero")
@Api(value = "/Hero", description = "")
public class HeroController extends BaseController {

	@Autowired
	private HeroService heroService;

	@ApiOperation(value = "查询",notes = "查询",httpMethod = "GET")
	@GetMapping(value = "/query")
	public ResponseEntity<HeroVo> query(@ApiParam(value = "ID", required = true)@RequestParam Integer id) throws DemoException {
		HeroPo po = heroService.queryWithValid(id);
		HeroVo vo = CopyUtil.transfer(po, HeroVo.class);
		return getSuccessResult(vo);
	}

	@ApiOperation(value = "查询数量",notes = "查询数量",httpMethod = "POST")
	@PostMapping(value = "/queryCount")
	public ResponseEntity<Integer> queryCount(@RequestBody @Valid HeroQueryForm form) throws DemoException {
		HeroCondition condition = this.getConditionByQueryForm(form);
		int count = heroService.queryCount(condition);
		return getSuccessResult(count);
	}

//	@ApiOperation(value = "查询列表",notes = "查询列表",httpMethod = "POST")
//	@PostMapping(value = "/queryList")
//	public ResponseEntity<CentreListResponse<HeroVo>> queryList(@RequestBody @Valid HeroQueryForm form) throws DemoException {
//		HeroCondition condition = this.getConditionByQueryForm(form);
//		List<HeroPo> poList = heroService.queryList(condition);
//		List<HeroVo> voList = CopyUtil.transfer(poList, HeroVo.class);
//		return getSuccessResult(getListResponse(voList));
//	}
//
//	@ApiOperation(value = "查询列表(带分页)",notes = "查询列表(带分页)",httpMethod = "POST")
//	@PostMapping(value = "/queryPageList")
//	public ResponseEntity<CentreCutPageResponse<HeroVo>> queryPageList(@RequestBody @Valid HeroQueryForm form) throws DemoException {
//		HeroCondition condition = this.getConditionByQueryForm(form);
//		List<HeroVo> voList = new ArrayList<>();
//		int count = heroService.queryCount(condition);
//		if (count > 0) {
//			List<HeroPo> poList = heroService.queryList(condition);
//			voList = CopyUtil.transfer(poList, HeroVo.class);
//		}
//		return getSuccessResult(getPageResponse(form, count, voList));
//	}

	@ApiOperation(value = "新增",notes = "新增",httpMethod = "POST")
	@PostMapping(value = "/add")
	public ResponseEntity<HeroVo> add(@RequestBody @Valid HeroCreateForm form) throws DemoException {
		HeroPo po = CopyUtil.transfer(form, HeroPo.class);

		//[3]保存
		heroService.insert(po);
		HeroVo vo = CopyUtil.transfer(po, HeroVo.class);
		return getSuccessResult(vo);
	}

	@ApiOperation(value = "修改",notes = "修改",httpMethod = "POST")
	@PostMapping(value = "/update")
	public ResponseEntity update(@RequestBody @Valid HeroUpdateForm form) throws DemoException {
		HeroPo po = CopyUtil.transfer(form, HeroPo.class);

		heroService.update(po);
		return getSuccessResult();
	}

	@ApiOperation(value = "删除",notes = "删除",httpMethod = "POST")
	@PostMapping(value = "/delete")
	public ResponseEntity delete(@RequestBody @Valid HeroDeleteForm form) throws DemoException {
		heroService.delete(form.getId());
		return getSuccessResult();
	}

	/**
	 * HeroQueryForm转换为HeroCondition
	 *
	 * @param form
	 * @return
	 */
	private HeroCondition getConditionByQueryForm(HeroQueryForm form) {
		HeroCondition condition = CopyUtil.transfer(form, HeroCondition.class);
		return condition;
	}

}