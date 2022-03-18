package bean.test;

import bean.config.A;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author Qiang.Qi
 * @Date: 2022/3/18 14:52
 */
public class StartTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(A.class);
		A bean = annotationConfigApplicationContext.getBean(A.class);
		System.out.println(bean);
	}
}
