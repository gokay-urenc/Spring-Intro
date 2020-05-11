package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		// CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		
		// CustomerManager customerManager = new CustomerManager(context.getBean("database", ICustomerDal.class));
		
		ICustomerManager customerManager = context.getBean("service", ICustomerManager.class);
		
		customerManager.add();
	}
}