package com.rj.bd;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;

@WebServlet("/yanzhengma.do")
@SuppressWarnings("serial")
public class Yanzhengma extends HttpServlet {
	 @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        //HuTool定义图形验证码的长和宽,验证码的位数，干扰线的条数
	        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(80, 40);
	        //将验证码放入session
	        request.getSession().setAttribute("code",lineCaptcha.getCode());
	        lineCaptcha.write( response.getOutputStream());
	        response.getOutputStream().close();

	    }

}