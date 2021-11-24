package anand.com.springApp.componentScan;

import anand.com.springApp.start.scope.JdbcConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentPersondao {

    @Autowired
    private ComponentJdbcConnection componentJdbcConnection;

    public ComponentJdbcConnection getComponentJdbcConnectionn() {
        return componentJdbcConnection;
    }

    public void setComponentJdbcConnection(ComponentJdbcConnection componentJdbcConnection) {
        this.componentJdbcConnection = componentJdbcConnection;
    }


}
