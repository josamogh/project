package com.ashish.devops;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevopsApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testHomeController() {
		HomeController homeController = new HomeController();
		String result = homeController.home();
		Assert.assertEquals(result, "Hello World!");
	}

}
