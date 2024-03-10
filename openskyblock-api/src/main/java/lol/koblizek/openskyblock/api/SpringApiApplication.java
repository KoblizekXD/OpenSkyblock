package lol.koblizek.openskyblock.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringApiApplication.class);
    }

    @Bean
    public DataSource datasource() {
        return DataSourceBuilder.create()
                .driverClassName("org.sqlite.JDBC")
                .url("jdbc:sqlite:plugins/OpenSkyblock/localdb.db")
                .build();
    }
}
