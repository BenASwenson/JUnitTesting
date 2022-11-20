package org.example.test;

import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void testGetMessage() {
        String result = Main.getMessage("Ben");
        String expected = "Welcome, Ben, to this program.";
        assertEquals(expected, result);
    }


}

