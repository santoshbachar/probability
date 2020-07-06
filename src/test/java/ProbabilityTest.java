import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ProbabilityTest {
    Probability event1, event2;

    @Before
    public void setup() {
        event1 = new Probability(1);
        event2 = new Probability(1);
    }

    @Test
    public void test_whenInputValueIsZero_shouldReturnHeads() {
        boolean result1 = event1.compare(event2);
        boolean expectedOutput = true;
        assertEquals(expectedOutput, result1);
    }
}
