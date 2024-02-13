// Bipredicate

import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (num1, num2) -> num1 > num2;
        System.out.println(biPredicate.test(5, 3)); // true
        System.out.println(biPredicate.test(3, 5)); // false
    }
}

