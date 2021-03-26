
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class League {

    static Map<String, Integer> teams = new HashMap<String, Integer>();
    static String fileInput = "input.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Reader.main(fileInput, teams);
        sortedList(teams);

        System.out.println("\nScoreboard completed: ");
        System.out.println("--------------------- ");
        printScoreboard(teams);

    }

    public static void printScoreboard(Map teams){
        Iterator it = teams.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " " + pair.getValue());
            it.remove();
        }
    }


   public static Map<String, Integer> sortedList(Map<String, Integer> map) {
       Map<String, Integer> alphList = teams.entrySet().stream().sorted(Map.Entry.comparingByKey())
               .collect(Collectors.toMap(
                       Map.Entry::getKey,
                       Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
       // Sorted by points
       Map<String, Integer> pointsList = alphList.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
               .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue, newValue) -> oldValue, LinkedHashMap::new));
       teams = pointsList;

       return teams;
   }

}
