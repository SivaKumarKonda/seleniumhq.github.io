package junit5;

import org.junit.jupiter.api.*;


class MathUtilsTest {

    MathUtils mu = null;

    @BeforeEach
    void setUp() {

        mu = new MathUtils();
    }

    @AfterEach
    void tearDown() {
        mu = null;
    }

    @Test
    @DisplayName("adding 2 numbers")
    void add() {

        int add = mu.add(1, 2);
        Assertions.assertEquals(3, add);
    }

    @Test
    @DisplayName("area of a circle with radius")
    void area() {
        double area = mu.area(5);
        Assertions.assertEquals(78.53981633974483, area, "expected area is not equal to actual");
    }

    @Test
    void testDivide() {

        Assertions.assertEquals(5, mu.divide(1));
    }

    @Test
    void testDivideException() {

        Assertions.assertThrows(ArithmeticException.class, () -> mu.divide(0), "execption throwed");
    }
}