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

}
