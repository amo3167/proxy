package au.com.sportsbet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "au.com.sportsbet.proxy" })
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
