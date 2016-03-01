package cn.inteldata.travelorder.common;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ac.refresh();
		ac.start();
		SqlSessionTemplate temp = (SqlSessionTemplate)ac.getBean("sqlSessionTemplate");
		System.out.println(temp);
		
		ac.close();
	}
}
