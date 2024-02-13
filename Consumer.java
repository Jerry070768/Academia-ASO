import java.io.RandomAccessFile;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String cadena1 = "Ejercicio 1 : Interface funcional Consumer ";
        String cadena2 = "La longitud del texto es de: ";
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept(cadena1+cadena2+cadena1.length());
    }
}