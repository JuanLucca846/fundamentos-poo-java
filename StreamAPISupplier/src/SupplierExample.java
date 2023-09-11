import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Hello";

        List<String> listaSaudacao = Stream.generate(() ->  "Hello")
                .limit(5)
                .toList();

        listaSaudacao.forEach(System.out::println);
    }
}