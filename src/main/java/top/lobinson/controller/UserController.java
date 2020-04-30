package top.lobinson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lobin
 * @date 2020/4/28
 */
@RestController
public class UserController {

	@GetMapping
	public String show() {
		return "show";
	}

}
