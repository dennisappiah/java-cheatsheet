package functionalinterfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdasDemo {

    public static void main(String[] args) {
        show();
    }
    public static void show() {
        List<String> list = List.of("a", "b", "c");

        // consumes a string and returns nothing
        Consumer<String> print = System.out::println;
        Consumer<String> printUppercase = item -> System.out.println(item.toUpperCase());

        list.forEach(print.andThen(printUppercase).andThen(print));

        Supplier<Double> getRandom = () -> Math.random();
        var random = getRandom.get();
        System.out.println(random);

        //A  function that takes a string argument and returns a string
        // "key:value"
        // first-> "key=value"
        // second-> {"key=value"}
        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";

        var result = replaceColon.andThen(addBraces).apply("key:value");
        System.out.println(result);
    }
}
