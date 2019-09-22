package net.riking.mybatis.simple;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import java.io.IOException;
import java.io.Reader;

/**
 * @Description sqlSessionFactory
 * @Author kongLiuYi
 * @Date 2019/9/21 0021 19:56
 */
public class BaseMapperTest {
	 SqlSession   openSession;
	
	@Before
	public  void init(){
		try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactory    sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			openSession=sqlSessionFactory.openSession();
            reader.close();
        } catch (IOException ignore) {
        	ignore.printStackTrace();
        }
	}

	@After
	public  void  closeSqlSession(){
		openSession.close();
	}
	
}
