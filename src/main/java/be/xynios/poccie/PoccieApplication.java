package be.xynios.poccie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class PoccieApplication {


    public static void main(String[] args) {
        SpringApplication.run(PoccieApplication.class, args);
    }

}
