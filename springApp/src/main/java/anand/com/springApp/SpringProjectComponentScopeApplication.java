package anand.com.springApp;

import anand.com.springApp.componentScan.ComponentJdbcConnection;
import anand.com.springApp.componentScan.ComponentPersondao;
import anand.com.springApp.start.scope.JdbcConnection;
import anand.com.springApp.start.scope.Persondao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringProjectComponentScopeApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringProjectComponentScopeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectComponentScopeApplication.class, args);

		ApplicationContext applicationcontext = SpringApplication.run(SpringProjectComponentScopeApplication.class,args);
		ComponentPersondao componentPersondao = applicationcontext.getBean(ComponentPersondao.class);
		ComponentJdbcConnection res = componentPersondao.getComponentJdbcConnectionn();

		LOGGER.info("{}", componentPersondao);

	}


}
