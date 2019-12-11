package com.zb.study.controller;

import com.zb.study.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @description:
 * @author: zhangbing
 * @create: 2019-12-10 13:52
 **/
@Controller
public class CarController {

	@Autowired
	private CarService carService;

}
