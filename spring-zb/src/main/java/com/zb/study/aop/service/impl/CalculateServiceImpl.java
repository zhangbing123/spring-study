package com.zb.study.aop.service.impl;

import com.zb.study.aop.service.CalculateService;
import org.springframework.stereotype.Service;

/**
 * @description: 计算类
 * @author: zhangbing
 * @create: 2020-09-29 09:31
 **/
@Service
public class CalculateServiceImpl implements CalculateService {

	@Override
	public void add(int i, int k) {
		System.out.println("add 入参:[" + i + "," + k + "],结果：" + (i + k));
	}

	@Override
	public void sub(int i, int k) {
		System.out.println("sub 入参:[" + i + "," + k + "],结果：" + (i - k));
	}

	@Override
	public void mul(int i, int k) {
		System.out.println("mul 入参:[" + i + "," + k + "],结果：" + (i * k));
	}

	@Override
	public void div(int i, int k) {
		System.out.println("div 入参:[" + i + "," + k + "],结果：" + (i / k));
	}

}
