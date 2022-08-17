import main.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StepsTest {

    @Test
    void getTotalSteps() {
        long result = Main.getTotalSteps("BZA", Main.getData());
        assertEquals(4, result);

        result = Main.getTotalSteps("ZNMD", Main.getData());
        assertEquals(23, result);
    }
}