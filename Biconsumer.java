// Biconsumer
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        String cadena1 = "Ejercicio 1 : Interface funcional Consumer ";
        String cadena2 = "La longitud del texto es de: ";
        String cadena3 = cadena2+cadena1.length();
        BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(cadena1 + ", " + cadena3);
        biConsumer.accept("Ejemplo de Interface Funcional", "Biconsumer");
        biConsumer.toString();
    }
}