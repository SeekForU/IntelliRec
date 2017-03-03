package io.vicp.goradical.intellirec.spring4;

import io.vicp.goradical.intellirec.model.user.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.Date;

public class SpringTest {
	private static final Logger LOG = LogManager.getLogger(SpringTest.class);
	private ApplicationContext ac;

	@Before
	public void setUp() throws Exception {
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void testDataSource() throws Exception {
		DataSource dataSource = (DataSource) ac.getBean("dataSource");
		LOG.info(dataSource);
	}

	@Test
	public void testSessionFactory() {
		SessionFactory sessionFactory = (SessionFactory) ac.getBean("sessionFactory");
	}

	@Test
	public void testUser() throws Exception {
		User user = new User();
		user.setId(1343);
		user.setName("radical");
		user.setEmail("499508968@qq.com");
		user.setNickName("hello world");
		user.setPassword("root");
		user.setRegDate(new Date());
		LOG.info(user);
	}
}