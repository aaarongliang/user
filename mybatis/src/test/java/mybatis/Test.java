package mybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.partner.dao.UserDao;

public class Test {
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/springmvc/spring-mvc.xml");
        UserDao beanA = (UserDao) context.getBean("userDao");
	}
}
