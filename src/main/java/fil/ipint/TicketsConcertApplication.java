package fil.ipint;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration // indique a spring que cette classe peut conteni de la configuration
@SpringBootApplication
public class TicketsConcertApplication {

    public static void main(String[] args) {

        SpringApplication.run( TicketsConcertApplication.class,args);}


}








