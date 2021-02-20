package com.rj.bd;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

public class ErWeiMa {
	public static void main(String[] args) {
		QrCodeUtil.generate(//
				"https://www.baidu.com/", // 二维码内容
				QrConfig.create().setImg("D:/001.jpg"), // 附带logo
				FileUtil.file("D:/qrcodeWithLogo.jpg")// 写出到的文件
		);
		System.out.println("生成成功");
	}
}
