package wai.jokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//Tell Spring to search the classpath for the file classpath:chuck-config.xml
//and pull that in Spring Context
@ImportResource("classpath:chuck-config.xml")
public class JokesApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokesApplication.class, args);
    }

}
