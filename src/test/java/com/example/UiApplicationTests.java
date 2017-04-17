package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UiApplicationTests {

	@Autowired
    UserDao userDao;

	@Test
	public void contextLoads() {
		User user = new User("UserName", "password");
		userDao.save(user);
		User result = userDao.findOne(user.getId());
		assertTrue(result.equals(user));

	}

}
