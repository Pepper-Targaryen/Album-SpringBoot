package com.sjtu.album.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	// 127.0.0.1:8080/hello
	@RequestMapping("hello")
	public String hellotest() {
		return "Hello World.";
	}
}
