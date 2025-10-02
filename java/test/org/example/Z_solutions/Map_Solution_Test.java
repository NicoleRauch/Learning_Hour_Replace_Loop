package org.example.Z_solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map_Solution_Test {

    @Test
    public void test_plusOne() {

        // ARRANGE
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // ACT
        List<Integer> result = input.stream().map(i -> i+1).toList();

        // ASSERT
        Assertions.assertThat(result).containsExactly(2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

    }

    @Test
    public void test_parseInt() {

        // ARRANGE
        List<String> input = Arrays.asList("1", "2", "3", "4", "5");

        // ACT
        List<Integer> result = input.stream().map(Integer::parseInt).toList();

        // ASSERT
        Assertions.assertThat(result).containsExactly(1, 2, 3, 4, 5);
    }

    @Test
    public void test_lengthOfString() {

        // ARRANGE
        List<String> input = Arrays.asList("Hello", "I", "am", "glad", "to", "meet", "you");

        // ACT
        List<Integer> result = input.stream().map(String::length).toList();

        // ASSERT
        Assertions.assertThat(result).containsExactly(5, 1, 2, 4, 2, 4, 3);
    }

}
