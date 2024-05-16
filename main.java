import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {
        // Створення списку дiйсних чисел
        List<Double> numbers = new ArrayList<>();
        numbers.add(36.0);
        numbers.add(81.0);
        numbers.add(16.0);

        // Використання лямбда-виразу для пошуку квадратного кореня
        List<Double> squareRoots = numbers.stream()
                .map(number -> Math.sqrt(number))
                .collect(Collectors.toList());

        // Виведення результатів
        System.out.println("Список квадратних коренів:");
        for (Double squareRoot : squareRoots) {
            System.out.println(squareRoot);
        }
    }
}
