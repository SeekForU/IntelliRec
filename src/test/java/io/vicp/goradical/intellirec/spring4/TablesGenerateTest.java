package io.vicp.goradical.intellirec.spring4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class TablesGenerateTest {
	private static final Logger LOG = LogManager.getLogger(TablesGenerateTest.class);
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
		LOG.info(sessionFactory);
	}

	@Test
	public void tablesGenerator() throws Exception {
		LOG.info("tables generate successfully.........");
	}

}