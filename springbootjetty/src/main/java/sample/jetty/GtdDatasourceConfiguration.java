package sample.jetty;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import org.apache.commons.encourage.BasicDataSource

@Configuration
public class GtdDatasourceConfiguration {

	@Bean
	public DataSource datasource() {
		// final DataSource dataSource = new BaseDataSource();

		// "com.mysql.jdbc.Driver"
		return null;
	}

//            @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
// 
//        dataSource.setDriverClassName(env.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));
//        dataSource.setUrl(env.getRequiredProperty(PROPERTY_NAME_DATABASE_URL));
//        dataSource.setUsername(env.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));
//        dataSource.setPassword(env.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));
// 
//        return dataSource;
//    }
        
}
