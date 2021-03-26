import java.util.Map;

public class Team implements Comparable<Team>{

    public String teamName;
    private int score;
    private int leaguePoints;

    public Team(Map<String, Integer> map) {
        League.teams = map;
        this.leaguePoints = 0;
        System.out.println("team object created: " + teamName);
    }

    public Team(String teamName, int score) {
        this.teamName = teamName;
        this.score = score;
        this.leaguePoints = 0;
    }

    public String getName() {
        return League.teams.get("teamName").toString();
    }

    public int getLeaguePoints() {
        return League.teams.get("leaguePoints");
    }

    public void setLeaguePoints(int points) {
        this.leaguePoints += points;
    }

    @Override
    public int compareTo(Team o) {
        return this.getName().compareTo(o.getName());
    }
}
