package test.java.org.example.A_filter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter_Test {

    @Test
    public void test_even() {

        // ARRANGE
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // ACT
        // Change this to apply the filter function:
        List<Integer> result = new ArrayList<>();
        for(int i : input){
            if(i%2==0){
                result.add(i);
            }
        }

        // ASSERT
        Assertions.assertThat(result).containsExactly(2,4,6,8,10);

    }

    @Test
    public void test_capitalized() {

        // ARRANGE
        List<String> input = Arrays.asList("Hello", "hello", "hEllO", "HELLO");

        // ACT
        // Change this to apply the filter function:
        List<String> result = new ArrayList<String>();
        for(String s : input){
            if(s.substring(0,1).toUpperCase().equals(s.substring(0,1))){
                result.add(s);
            }
        }

        // ASSERT
        Assertions.assertThat(result).containsExactly("Hello", "HELLO");
    }
}
