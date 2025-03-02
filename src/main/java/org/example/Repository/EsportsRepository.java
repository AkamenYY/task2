package org.example.Repository;

import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class EsportsRepository {
    private final Map<String, String> players = new HashMap<>();
    private final List<String> organizations = new ArrayList<>();
    private final List<String> topTier1Organizations = new ArrayList<>();

    public EsportsRepository() {
        // Tier 1 players
        players.put("Donk", "Spirit");
        players.put("m0NESY", "G2 Esports");
        players.put("NiKo", "Falcons");
        players.put("B1t", "NAVI");
        players.put("ropz", "Vitality");

        // Tier 2 players
        players.put("Jame", "Parivision");
        players.put("XANTARES", "Eternal Fire");
        players.put("khaN", "Nemiga");
        players.put("snow", "paiN");
        players.put("tN1R", "HEROIC");

        // All organizations
        organizations.addAll(List.of(
                "Spirit", "G2 Esports", "NAVI", "Vitality", "FaZe Clan",
                "Parivision", "Eternal Fire", "Nemiga", "paiN", "HEROIC"
        ));

        // Top 5 Tier 1 organizations
        topTier1Organizations.addAll(List.of(
                "Spirit", "G2 Esports", "NAVI", "Vitality", "FaZe Clan"
        ));
    }

    public Map<String, String> getPlayers() {
        return players;
    }

    public List<String> getOrganizations() {
        return organizations;
    }

    public List<String> getTopTier1Organizations() {
        return topTier1Organizations;
    }
}


