package org.example.Beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class LazyBean {
    public LazyBean() {
        System.out.println("Создан LazyBean");
    }
}
