package org.example.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.example.Repository.EsportsRepository;

@Service
@Primary
public class DefaultEsportsService implements EsportsService {
    private final EsportsRepository repository;

    public DefaultEsportsService(EsportsRepository repository) {
        this.repository = repository;
    }

    @Override
    public void listPlayers() {
        System.out.println("=== Default Esports Service ===");
        System.out.println("All Tier-1 and Tier-2 players:");
        repository.getPlayers().forEach((player, team) ->
                System.out.println(player + " plays for " + team));
        System.out.println();
    }

    @Override
    public void listOrganizations() {
        System.out.println("All known esports organizations:");
        repository.getOrganizations().forEach(System.out::println);
        System.out.println();
    }
}
