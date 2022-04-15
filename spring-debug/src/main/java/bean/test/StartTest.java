package bean.test;

import bean.config.A;
import bean.entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @Author Qiang.Qi
 * @Date: 2022/3/18 14:52
 */
public class StartTest {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(A.class);
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-application-context.xml");
		A bean = applicationContext.getBean(A.class);
//		Person p = applicationContext.getBean(Person.class);
	}
}
