import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("Ejercicio 1 : Interface funcional Consumer");
        consumer.accept("Ejercicio 2 : Gerardo Rodríguez Trejo");
    }
}