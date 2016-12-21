package kr.or.dgit.bigdata.school;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.bigdata.school.util.ConnectionFactory;
import kr.or.dgit.bigdata.school.util.jdbcUtil;

public class ConnectionFactoryTest {
	private static Connection instance;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		instance = ConnectionFactory.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		jdbcUtil.close(instance);
	}

	@Test
	public void testConnection() {
		Assert.assertNotNull(instance);
	}

}
