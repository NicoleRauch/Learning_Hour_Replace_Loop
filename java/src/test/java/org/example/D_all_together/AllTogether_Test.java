package test.java.org.example.D_all_together;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AllTogether_Test {

    @Test
    public void test_all_together() {

        // ARRANGE + ACT
        // Change this to apply the functions you learned about:
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum = sum + i * i;
        }

        // ASSERT
        Assertions.assertThat(sum).isEqualTo(385);
    }

}
