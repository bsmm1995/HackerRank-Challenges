package com.bsmm.steps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void getTotalSteps() {
        long result = Main.getTotalSteps("BZA", Main.getData());
        assertEquals(4, result);

        result = Main.getTotalSteps("ZNMD", Main.getData());
        assertEquals(23, result);
    }
}