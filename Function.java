import java.util.function.Function;
public class Main {
    public static void main(String[] args) {
        Function<String, Integer> function = (s) -> s.length();
        System.out.println(function.equals("Ejemplo de Interface Funcional Function"));
        System.out.println(function.apply("Ejemplo de Interface Funcional Function"));
    }
}
