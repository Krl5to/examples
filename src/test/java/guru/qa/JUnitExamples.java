package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitExamples {

    @Test
    void firstTest() {
        Assertions.assertTrue(3 > 2);
    }

}