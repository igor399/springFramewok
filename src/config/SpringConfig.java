package config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import spring_intro.Cat;
import spring_intro.Person;
import spring_intro.Pet;

import java.awt.event.PaintEvent;


@Configuration
//@ComponentScan("spring_intro")
public class SpringConfig {

    @Bean
    @Scope("prototype")
    public Pet idCat(){
        return new Cat();
    }

    @Bean
    @Scope("singleton")
    public Person idPerson(){
        return new Person(idCat());
    }
}
