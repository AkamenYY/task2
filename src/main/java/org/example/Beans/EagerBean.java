package org.example.Beans;

import org.springframework.stereotype.Component;

@Component
public class EagerBean {
    public EagerBean() {
        System.out.println("Создан EagerBean");
    }
}
