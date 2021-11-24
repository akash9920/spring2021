package anand.com.springApp;

import anand.com.springApp.start.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringProjectBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectBasicApplication.class, args);

		ApplicationContext applicationcontext = SpringApplication.run(SpringProjectBasicApplication.class,args);
		BinarySearchImpl binarySearch = applicationcontext.getBean(BinarySearchImpl.class);
		int res = binarySearch.getNumberOrder(new int[] {1,2,3,4,5}, 3);
		System.out.println("result   : " + res);
	}


}
