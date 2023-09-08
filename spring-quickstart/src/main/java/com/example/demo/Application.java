package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.model.Address;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("beanScope.xml");
	
		Address bean1 =(Address)ctx.getBean("offAddress");
		
		Address bean2 =(Address)ctx.getBean("offAddress");

		Address bean3 =(Address)ctx.getBean("resiAddress");
		
		// since its singleton bean refers to the same location we get true

		System.out.println(bean1==bean2);
		
		// even though singleton the bean id is different you can new instance
		System.out.println(bean1==bean3);
		
		
		
		System.out.println(ctx.getBean("resiAddress",Address.class));
		

		System.out.println(ctx.getBean("offAddress",Address.class));

		
	}

}
