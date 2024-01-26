package junit5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @BeforeEach
    void setUp() {
        System.out.println("before test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("after test");
    }

    @Test
    void add() {
        System.out.println("in test");
    }
}