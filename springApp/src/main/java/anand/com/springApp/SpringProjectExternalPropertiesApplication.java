package anand.com.springApp;

import anand.com.springApp.start.properties.SomeExternalService;
import anand.com.springApp.start.scope.JdbcConnection;
import anand.com.springApp.start.scope.Persondao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// run as java class to see the errors
@SpringBootApplication
@PropertySource("classpath:app.properties")
public class SpringProjectExternalPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectExternalPropertiesApplication.class, args);

		ApplicationContext applicationcontext = SpringApplication.run(SpringProjectExternalPropertiesApplication.class,args);
		SomeExternalService someExternalService = applicationcontext.getBean(SomeExternalService.class);

		String res = someExternalService.geturl();
		System.out.println("res : " + res);

	}


}
