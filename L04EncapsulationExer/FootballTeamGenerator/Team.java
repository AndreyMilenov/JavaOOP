package NewFolder.FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(String name) {
        boolean isRemoved = players.removeIf(p -> p.getName().equals(name));
        if (!isRemoved) {
            throw new IllegalArgumentException("Player "+name+" is not in "+getName()+" team.");
        }
    }

    public double getRating() {
        double rating = players.stream().mapToDouble(Player::overallSkillLevel).average().orElse(0);
        return rating;
    }
}
