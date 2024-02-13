// Predicate

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (num) -> num > 0;
        System.out.println(predicate.test(5)); // true
        System.out.println(predicate.test(-5)); // false
    }
}
