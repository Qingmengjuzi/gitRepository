package com.why.mybatis.test;

import java.io.InputStream;
import java.sql.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.why.mybatis.entity.User;

public class MybatisTest {
private SqlSessionFactory sqlSessionFactory = null;
@Before
public void init() throws Exception{
	//1.创建SqlSessionFactoryBuilder对象
	SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
	//2.加载SqlMapConfig.xml配置文件
	InputStream ssfInputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
	//3.创建SqlSessionFactory对象
	this.sqlSessionFactory= sqlSessionFactoryBuilder.build(ssfInputStream);
	
}
@Test
public void testQueryUserById() throws Exception{
	//4.创建SqlSession对象
	SqlSession sqlSession = sqlSessionFactory.openSession();
	//5.执行SqlSession对象执行查询，获取结果User
	//第一个参数是User.xml的statement的id，第二个参数是执行sql需要的参数
	System.out.println("sdf");
	User user = sqlSession.selectOne("queryUserById",1);
	//6.打印结果
	System.out.println("user");
	System.out.println(user);
	//7.释放资源
	sqlSession.close();
	
}
@Test
public void testQueryUsername1() throws Exception{
	//4.创建SqlSession对象
	SqlSession session = sqlSessionFactory.openSession();
	//5.执行SqlSession对象执行查询，获取结果User
	//第一个参数是User.xml的statement的id，第二个参数是执行sql需要的参数
	List<Object> list = session.selectList("queryUserByUsername1","五" );
	//6.打印结果
	for (Object user : list) {
		System.out.println(user);
	}
	//7.释放资源
	session.close();
}
@Test
public void testSaveUser() {
	//创建sqlSession对象
	SqlSession session = sqlSessionFactory.openSession();
	//执行SqlSession对象执行保存
	//创建需要执行的User
	User user = new User();
	user.setUsername("张飞");
	user.setSex("1");
	user.setBirthday(new Date(2014-12-12));
	user.setAddress("蜀国");
	session.insert("saveUser", user);
	System.out.println(user);

	// 需要进行事务提交
	session.commit();

	// 7. 释放资源
	session.close();
}
@Test
public void testUpdateUserById() {
	//4.创建SqlSession对象
	SqlSession sqlSession = sqlSessionFactory.openSession();
	//执行SqlSession对象执行保存
	//创建需要执行的User
	User user = new User();
	user.setId(26);
	user.setUsername("guanyu");
	user.setSex("1");
	user.setAddress("蜀国");
	
	sqlSession.update("updateUserById",user);
	//需要进行事务提交
	sqlSession.commit();
	//释放资源
	sqlSession.close();
}
@Test
public void testDeleteUserById() {
	//创建Sqlsession
	SqlSession sqlSession = sqlSessionFactory.openSession();
	//执行sqlsession对象执行保护
	//创建需要执行的user
	sqlSession.delete("deleteUserById",46);
	//需要进行事务提交
	sqlSession.commit();
	//释放资源
	sqlSession.close();
	
}






}
