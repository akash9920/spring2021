package anand.com.springApp;

import anand.com.springApp.start.scope.JdbcConnection;
import anand.com.springApp.start.scope.Persondao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringProjectScopeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectScopeApplication.class, args);

		ApplicationContext applicationcontext = SpringApplication.run(SpringProjectScopeApplication.class,args);
		Persondao persondao = applicationcontext.getBean(Persondao.class);
		JdbcConnection res = persondao.getJdbcConnection();

	}


}
