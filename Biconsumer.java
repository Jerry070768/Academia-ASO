// Biconsumer
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(s1 + ", " + s2);
        biConsumer.accept("Ejemplo de Interface Funcional", "Biconsumer");
        biConsumer.toString();
    }
}