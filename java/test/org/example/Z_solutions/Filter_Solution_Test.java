package org.example.Z_solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter_Solution_Test {

    @Test
    public void test_even() {

        // ARRANGE
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // ACT
        List<Integer> result = input.stream().filter(i -> i%2==0).toList();

        // ASSERT
        Assertions.assertThat(result).containsExactly(2,4,6,8,10);

    }

    @Test
    public void test_capitalized() {

        // ARRANGE
        List<String> input = Arrays.asList("Hello", "hello", "hEllO", "HELLO");

        // ACT
        List<String> result = input.stream().filter(s -> s.substring(0,1).toUpperCase().equals(s.substring(0,1))).toList();

        // ASSERT
        Assertions.assertThat(result).containsExactly("Hello", "HELLO");
    }
}
