package config;


import org.springframework.context.annotation.*;
import spring_intro.Cat;
import spring_intro.Person;
import spring_intro.Pet;

import javax.annotation.PreDestroy;
import java.awt.event.PaintEvent;


@Configuration
@PropertySource("classpath:person.properties")
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
