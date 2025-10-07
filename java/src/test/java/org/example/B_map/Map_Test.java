package test.java.org.example.B_map;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map_Test {

    @Test
    public void test_plusOne() {

        // ARRANGE
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // ACT
        // Change this to apply the map function:
        List<Integer> result = new ArrayList<>();
        for (int i : input) {
            result.add(i + 1);
        }

        // ASSERT
        Assertions.assertThat(result).containsExactly(2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

    }

    @Test
    public void test_parseInt() {

        // ARRANGE
        List<String> input = Arrays.asList("1", "2", "3", "4", "5");

        // ACT
        // Change this to apply the map function:
        List<Integer> result = new ArrayList<>();
        for (String s : input) {
            result.add(Integer.parseInt(s));
        }

        // ASSERT
        Assertions.assertThat(result).containsExactly(1, 2, 3, 4, 5);
    }

    @Test
    public void test_lengthOfString() {

        // ARRANGE
        List<String> input = Arrays.asList("Hello", "I", "am", "glad", "to", "meet", "you");

        // ACT
        // Change this to apply the map function:
        List<Integer> result = new ArrayList<>();
        for (String s : input) {
            result.add(s.length());
        }

        // ASSERT
        Assertions.assertThat(result).containsExactly(5, 1, 2, 4, 2, 4, 3);
    }

}
