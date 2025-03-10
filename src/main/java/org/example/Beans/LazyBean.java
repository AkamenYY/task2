package org.example.Beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.example.Repository.EsportsRepository;

@Component
@Lazy
public class LazyBean {
    private final EsportsRepository repository;

    public LazyBean(EsportsRepository repository) {
        this.repository = repository;
    }

    public void printStatistics() {
        System.out.println("📊 Esports Statistics:");
        System.out.println("- Total Players: " + repository.getPlayers().size());
        System.out.println("- Total Organizations: " + repository.getOrganizations().size());
    }
}
