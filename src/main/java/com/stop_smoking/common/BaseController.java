package com.stop_smoking.common;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>基础控制层类 </p>
 * @author zengdegui
 * @date 2018年9月1日
 */
@ApiResponses({
	@ApiResponse(code = 200, message = "(成功)服务器已成功处理了请求", response = ResponseEntity.class),
	@ApiResponse(code = 201, message = "(已创建)请求成功并且服务器创建了新的", response = String.class),
	@ApiResponse(code = 204, message = "(无内容)服务器成功处理了请求，但没有返回任何内容", response = String.class),
	@ApiResponse(code = 400, message = "(未认证)请求要求身份验证", response = String.class),
	@ApiResponse(code = 401, message = "(未授权)请求要求权限验证", response = String.class),
	@ApiResponse(code = 403, message = "(禁止)服务器拒绝请求", response = String.class),
	@ApiResponse(code = 404, message = "(未找到)服务器找不到请求的网页", response = String.class),
	@ApiResponse(code = 405, message = "(方法禁用)禁用请求中指定的方法", response = String.class),
	@ApiResponse(code = 500, message = "(服务器内部错误)服务器遇到错误，无法完成请求 ", response = String.class)
})
public class BaseController {

	protected HttpServletRequest request;

	protected HttpServletResponse response;

	@ModelAttribute
	public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}
}
