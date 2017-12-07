package com.example.demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crady.bean.SystemParams;
import com.crady.bean.User;
import com.crady.bean.UserExample;
import com.crady.dao.UserMapper;

@RestController
@RequestMapping("user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
    @Autowired
    private UserMapper userMapper;
    
    @Value("${msg.log}")
    private String msgLog;
    
    @Autowired
    SystemParams systemParams;
    
	@ResponseBody
	@RequestMapping("/list")
	public List<User> listAll(){
		List<User> list = userMapper.selectByExample(new UserExample());
		System.out.println(list);
		logger.info("请求成功...{}",msgLog);
		logger.info(systemParams.toString());
		return list;
	}
	
}
