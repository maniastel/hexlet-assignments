package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int count) {
        int normalizedCount = Math.min(count, apartments.size());
        apartments.sort(Home::toCompare);
        List<Home> sublist = apartments.subList(0, normalizedCount);
        return sublist.stream()
                .map(appartment -> appartment.toString())
                .collect(Collectors.toList());
    }
}
// END
