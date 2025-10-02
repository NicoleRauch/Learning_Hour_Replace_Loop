package org.example.C_reduce;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Reduce_Test {

    @Test
    public void test_sum() {

        // ARRANGE
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // ACT
        // Change this to apply the map function:
        int result = 0;
        for (int i : input) {
            result += i;
        }

        // ASSERT
        Assertions.assertThat(result).isEqualTo(55);

    }

    @Test
    public void test_concatWithBlank() {

        // ARRANGE
        List<String> input = Arrays.asList("Hello", "I", "am", "glad", "to", "meet", "you");

        // ACT
        // Change this to apply the map function:
        String result = "";
        for (String s : input) {
            if(result.isEmpty()){
                result = s;
            } else {
                result = result + " " + s;
            }
        }

        // ASSERT
        Assertions.assertThat(result).isEqualTo("Hello I am glad to meet you");
    }

    @Test
    public void test_reverse() {

        // ARRANGE
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);

        // ACT
        // Change this to apply the map function:
        List<Integer> result = new ArrayList<>();
        for (Integer i : input) {
            result.addFirst(i);
        }

        // ASSERT
        Assertions.assertThat(result).containsExactly(5, 4, 3, 2, 1);
    }

}
