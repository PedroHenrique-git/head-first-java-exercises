package chapter12;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@FunctionalInterface
interface Iter<T> {
    void iter(T element);
}

public class App {
    public static final String[] names = new String[]{"luiz","pedro","henrique"};

    public static void main(String[] args) {
        List<String> colors = List.of("Red", "Blue", "Yellow");

        for(String c : colors) {
            System.out.println(c);
        }

        forEach((v) -> System.out.println(v));

        colors.forEach(System.out::println);

        List<String> strings = List.of("I", "am", "a", "List", "of", "Strings");

        List<String> newStrings = strings.stream()
                                        .sorted(String::compareToIgnoreCase)
                                        .skip(2)
                                        .distinct()
                                        .limit(4)
                                        .collect(Collectors.toList());

        System.out.println(newStrings);
    }

    public static Optional<String> getColor(String color) {
        List<String> colors = List.of("Red", "Black", "White", "Blue", "Yellow");

        Optional<String> selectedColor = colors.stream().filter(c -> c.equals(color)).findFirst();

        return selectedColor;

    }

    public static void forEach(Iter<String> iterator) {
        for(String n : names) {
            iterator.iter(n);
        }
    }
}
