import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aufgabe1 {


    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("abra",  "", "ka", "da", "bra",  "", "simsala",  "bim");
        final long amountBlanks = strings.stream().filter(String::isEmpty).count();
        System.out.println(amountBlanks);
        final List<String> notBlank = strings.stream().filter(words -> words.length()>0&&words.length()%2==0).collect(Collectors.toList());
        System.out.println(notBlank);
        final List<Double> randomNumbers = Stream.iterate(Math.random(), n -> Math.random()).limit(10).collect(Collectors.toList());
        System.out.println(randomNumbers);
        final List<Double> randomNumbersSorted = randomNumbers.stream().map(n->n=n*100).sorted().collect(Collectors.toList());
        System.out.println(randomNumbersSorted);

    }
}
