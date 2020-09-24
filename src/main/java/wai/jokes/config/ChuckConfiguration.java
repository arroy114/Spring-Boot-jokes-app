package wai.jokes.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Using a java configuration to include a bean of ChuckNorrisQuotes
//This is useful when you are dealing with external jar from an open source project
//and want to utilize that dependency with your application e.g. include it as a bean in the Spring Context

@Configuration
public class ChuckConfiguration {

    //Adding the following to be a bean
    //Here making ChuckNorrisQuotes as a bean
    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
