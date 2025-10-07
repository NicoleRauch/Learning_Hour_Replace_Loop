package test.java.org.example.Z_solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Reduce_Solution_Test {

    @Test
    public void test_sum() {

        // ARRANGE
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // ACT
        Integer result = input.stream().reduce(0, (acc, element) -> acc + element);
        Integer result2 = input.stream().reduce(0, Integer::sum);

        // ASSERT
        Assertions.assertThat(result).isEqualTo(55);
        Assertions.assertThat(result2).isEqualTo(55);

    }

    @Test
    public void test_concatWithBlank() {

        // ARRANGE
        List<String> input = Arrays.asList("Hello", "I", "am", "glad", "to", "meet", "you");

        // ACT
        String result = input.stream().reduce("", (acc, element) -> acc.isEmpty() ? element : acc + " " + element);

        // ASSERT
        Assertions.assertThat(result).isEqualTo("Hello I am glad to meet you");
    }

    @Test
    public void test_maximum() {

        // ARRANGE
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);

        // ACT
        // here you can see how much Java fights against working nicely with immutable lists...
        Integer result = input.stream().reduce(Integer.MIN_VALUE, (Integer acc, Integer element) -> element > acc ? element : acc);

        // ASSERT
        Assertions.assertThat(result).isEqualTo(5);
    }
}
