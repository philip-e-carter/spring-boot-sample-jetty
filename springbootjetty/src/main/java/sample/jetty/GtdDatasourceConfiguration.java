package sample.jetty;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class GtdDatasourceConfiguration {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/gtd-db");
        dataSource.setUsername("root");
        dataSource.setPassword("");

//      aws attempt throws "communications link failure", both here and from intellij database view.
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://gtd-db.ckqylf4efsrq.us-east-1.rds.amazonaws.com:3306/gtd-db");
//        dataSource.setUsername("gtd");
//        dataSource.setPassword("66dinosaur");

        return dataSource;
    }

}
