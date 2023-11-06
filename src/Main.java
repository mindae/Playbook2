import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int num = 1;
        System.out.println(num);
        String str = "hellodebug";
        System.out.println(str);

        int newnum = 1+100;
        System.out.println(newnum + 1);

        System.out.println(newnum + 1);
        System.out.println(newnum + 1);

        System.out.println(newnum + 2);
        System.out.println(newnum + 2);

        System.out.println(newnum + 3);
        System.out.println(newnum + 3);
        System.out.println(newnum + 5);

        Stream.of("hello", "world!","hello")
                .collect(Collectors.toMap(Function.identity(), String::length, (e, n) -> e))
                .forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
