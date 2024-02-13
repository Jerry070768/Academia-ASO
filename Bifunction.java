// BiFunction

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction = (s1, s2) -> s1 + " " + s2;
        System.out.println(biFunction.apply("Ejemplo de Interface Funcional", "Bifuntcion"));
        System.out.println(biFunction.equals("Ejemplo de Interface Funcional"));
    }
}