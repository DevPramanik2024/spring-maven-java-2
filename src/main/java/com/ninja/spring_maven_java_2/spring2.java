package com.ninja.spring_maven_java_2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class spring2 
{
@RequestMapping("/test")
public String test()
{
	return "I am test";
}

@RequestMapping("/jenkins")
public String jenkins()
{
	return "I am jenkins";
}
}
