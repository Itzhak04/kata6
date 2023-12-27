import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTests {
    @Test
    public void should_said_a_number_when_not_is_a_multiple() {
        assertThat(new FizzBuzz(1).sound()).isEqualTo("1");
    }

    @Test
    public void should_said_Fizz_when_is_a_multiple_of_3() {
        assertThat(new FizzBuzz(3).sound()).isEqualTo("Fizz");
    }

    @Test
    public void should_said_Fizz_when_is_a_multiple_of_5() {
        assertThat(new FizzBuzz(5).sound()).isEqualTo("Buzz");
    }

    @Test
    public void should_said_Fizz_when_is_a_multiple_of_3_and_5() {
        assertThat(new FizzBuzz(15).sound()).isEqualTo("FizzBuzz");
    }
}
