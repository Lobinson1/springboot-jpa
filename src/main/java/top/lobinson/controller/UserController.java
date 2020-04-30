package top.lobinson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lobinson.entity.UserOrg;
import top.lobinson.service.UserService;

import java.util.List;

/**
 * @author Lobin
 * @date 2020/4/28
 */
@RestController
@RequestMapping("u")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("show")
	public List<UserOrg> show() {
		return userService.getUserOrg();
	}

}
