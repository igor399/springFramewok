package aop.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Gang banger")
    private String name;

    public String getName() {
        return name;
    }
}
