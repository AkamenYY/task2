package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.example.Config.AppConfig;
import org.example.Service.EsportsService;
import org.example.Beans.LazyBean;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Primary Service
        EsportsService defaultService = context.getBean(EsportsService.class);
        defaultService.listPlayers();
        defaultService.listOrganizations();

        // Qualifier Service
        EsportsService alternativeService = context.getBean("alternativeEsportsService", EsportsService.class);

        alternativeService.listPlayers();
        alternativeService.listOrganizations();

        // Lazy Singleton
        LazyBean lazyBean = context.getBean(LazyBean.class);
        lazyBean.printStatistics();

        context.close();
    }
}

