package sample.jetty;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//import org.apache.commons.encourage.BasicDataSource

@Configuration
public class GtdDatasourceConfiguration {

	@Bean
	public DataSource datasource() {
		// final DataSource dataSource = new BaseDataSource();

		// "com.mysql.jdbc.Driver"
		return null;
	}

            @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
 
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/gtd-db");
        dataSource.setUsername("root");
        dataSource.setPassword("");
 
        return dataSource;
    }
        
}
