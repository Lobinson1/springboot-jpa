package top.lobinson.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lobinson.dao.UserDao;
import top.lobinson.entity.UserOrg;

import java.util.List;

/**
 * @author Lobin
 * @date 2020/4/30
 */
@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public List<UserOrg> getUserOrg() {
		return userDao.getUserOrg();
	}

}
