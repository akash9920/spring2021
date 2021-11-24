package anand.com.springApp;

import anand.com.springApp.start.scope.JdbcConnection;
import anand.com.springApp.start.scope.Persondao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// run as java class to see the errors
@Configuration
@ComponentScan
public class SpringCoreProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreProjectApplication.class, args);

		ApplicationContext applicationcontext = new AnnotationConfigApplicationContext(SpringCoreProjectApplication.class);
		Persondao persondao = applicationcontext.getBean(Persondao.class);
		JdbcConnection res = persondao.getJdbcConnection();

	}


}
