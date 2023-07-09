package com.example.demo;
import java.util.Arrays;
import java.util.HashMap;	
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	@RequestMapping("/")
	public Map<String,Object> getValues()
	{
		Map<String,Object> data = new HashMap<>();
		data.put("message", "Java Api is Working");
		data.put("Languages",Arrays.asList("Java","Python","Javascript"));
		data.put("code", 2345);
		return data;
	}
	

}
