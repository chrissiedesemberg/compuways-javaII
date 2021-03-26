import java.io.*;

import java.util.*;


public class Reader {
    static String line = "";

    public static void main(String filename, Map<String, Integer> teamsList) {
        System.out.println();

        filename = "input.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            while ((line = reader.readLine()) != null) {
                String[] gameScoring = line.split(", ");
                String team1 = gameScoring[0];
                String team2 = gameScoring[1];
                String[] team1Scoring = team1.split(" ", 2);
                String[] team2Scoring = team2.split(" ", 2);
                String teamName1 = team1Scoring[0];
                int teamScore1 = Integer.parseInt(team1Scoring[1]);
                String teamName2 = team2Scoring[0];
                int teamScore2 = Integer.parseInt(team2Scoring[1]);
                teamsList.put(teamName1, 0);
                teamsList.put(teamName2, 0);
                playGame(teamName1, teamScore1, teamName2, teamScore2 );
            }
            Iterator it = teamsList.entrySet().iterator();
                while (it.hasNext()){
                    Map.Entry pair = (Map.Entry)it.next();
                    System.out.println("Team created: " + pair.getKey());
                    new Team((String) pair.getKey(), (Integer) pair.getValue());
                }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
            }

    public static void playGame(String team1, int teamScore1, String team2, int teamScore2){
        if (teamScore1 == teamScore2) {
            League.teams.replace(team1, +1);
            League.teams.replace(team2, +1);
        } else if (teamScore1 > teamScore2) {
            League.teams.replace(team1, +3);
        } else {
            League.teams.replace(team2, +3);
        }
    }
}


