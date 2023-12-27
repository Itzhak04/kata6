import java.util.List;
import java.util.function.Function;

public record FizzBuzz(int i) {
    static List<Function<Integer,String>> youSaid= List.of(
            n-> n%15 ==0 ?"FizzBuzz":"",
            n-> n%3 ==0 ?"Fizz":"",
            n-> n%5 ==0 ?"Buzz":""

    );
    public String sound() {
        String result= youSaid.stream().
                map(rule->rule.apply(i)).
                filter(str->!str.isEmpty()).
                findFirst().
                orElse(Integer.toString(i));
        return result;
    }
}
