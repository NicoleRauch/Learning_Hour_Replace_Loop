package test.java.org.example.Z_solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class AllTogether_Solution_Test {

    @Test
    public void test_all_together() {

        // ARRANGE + ACT
        int sum = IntStream.rangeClosed(1, 10).map(x -> x*x).reduce(0, (x, y) -> x+y);

        // ASSERT
        Assertions.assertThat(sum).isEqualTo(385);
    }

}
