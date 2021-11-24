package anand.com.springApp.start.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Persondao {

    @Autowired
    private JdbcConnection jdbcConnection;

    public JdbcConnection getJdbcConnection() {
        System.out.println("JDBC connection is called");
        return jdbcConnection;
    }

    public void setJdbcConnection(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }


}
