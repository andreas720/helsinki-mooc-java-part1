import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> playerArrayList = new ArrayList<Player>();
    private int maxSize;


    public Team(String name) {
        this.name = name;
        this.maxSize = 16;
    }


    public String getName() {
        return this.name;
    }

    public void addPlayer(Player name) {

        if (this.playerArrayList.size() < this.maxSize) {
            this.playerArrayList.add(name);
        } else {
        }
    }

    public void printPlayers() {
        for (Player player : playerArrayList) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return playerArrayList.size();
    }

    public int goals() {
        int totalGoals = 0;
        for (Player player : playerArrayList) {
            totalGoals += player.goals();
        }
        return totalGoals;
    }
}

