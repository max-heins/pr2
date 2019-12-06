//CHECKSTYLE:OFF MagicNumber

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**Hauptklasse zur Verarbeitung aelterer Menschen mit Weitsprungergebnissen.
 * Aufgabenblatt2 Lambdas, Streams WS 2109/20
 * @author G. Schiedermeier, gschied@haw-landshut.de
 * @version 2019-10-13
 */
public class ElderlyMain {
    public static void main(String... args) {

        List<ElderlyPeople> elderly = new ArrayList<>();

        elderly.add(new ElderlyPeople("Hubert", 83, 1.25));
        elderly.add(new ElderlyPeople("Maria", 79, 1.11));
        elderly.add(new ElderlyPeople("Alois", 95, 1.65));
        elderly.add(new ElderlyPeople("Josefine", 76, 2.01));

        System.out.println(getOlderSeventy(elderly));
        System.out.println(getBestLongDistanceHopper(elderly));
    }

    public static List<ElderlyPeople> getOlderSeventy (List<ElderlyPeople> elderly)
    {
        return elderly.stream().filter(person->person.getAge()>70&&person.getLongJumpDistance()>1.5).collect(Collectors.toList());
    }

    public static ElderlyPeople getBestLongDistanceHopper(List<ElderlyPeople> elderly)
    {
        return elderly.stream().filter(person->person.getAge()>70).max(Comparator.comparingDouble(ElderlyPeople::getLongJumpDistance)).orElseThrow(NoSuchElementException::new);
    }
    
}