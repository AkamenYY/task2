package org.example.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.example.Repository.EsportsRepository;

import java.util.List;
import java.util.Map;

@Service
@Qualifier("alternative")
public class AlternativeEsportsService implements EsportsService {
    private final EsportsRepository repository;

    public AlternativeEsportsService(EsportsRepository repository) {
        this.repository = repository;
    }

    @Override
    public void listPlayers() {
        System.out.println("=== Alternative Esports Service ===");
        System.out.println("Top-5 Tier-1 players:");

        List<String> topTier1Teams = repository.getTopTier1Organizations();
        Map<String, String> players = repository.getPlayers();

        for (Map.Entry<String, String> entry : repository.getPlayers().entrySet()) {
            if (topTier1Teams.contains(entry.getValue())) {
                System.out.println(entry.getKey() + " plays for " + entry.getValue());
            }
        }
    }

    @Override
    public void listOrganizations() {
        System.out.println("Top-5 Tier-1 Organizations:");
        repository.getTopTier1Organizations().forEach(System.out::println);
        System.out.println();
    }
}


