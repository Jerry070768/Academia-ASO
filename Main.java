
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Ejemplo de Interface Funcional Supplier";
        Supplier<String> supplier2 = () -> "Gerardo Rodríguez Trejo";
        System.out.println(supplier.get());
        System.out.println(supplier.equals(supplier));
    }
}