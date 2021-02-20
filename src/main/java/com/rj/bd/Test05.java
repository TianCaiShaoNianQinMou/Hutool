package com.rj.bd;

import cn.hutool.core.util.StrUtil;

public class Test05 {
	public static void main(String[] args) {
		//判断是否为空字符串
		String str = "test";
		System.out.println(StrUtil.isEmpty(str));
		System.out.println(StrUtil.isNotEmpty(str));
		//去除字符串的前后缀
		System.out.println(StrUtil.removeSuffix("a.jpg", ".jpg"));
		System.out.println(StrUtil.removePrefix("a.jpg", "a."));
		//格式化字符串
		String template = "这只是个占位符:{}";
		String str2 = StrUtil.format(template, "我是占位符");
		System.out.println(str2);

	}
}
