package junit5;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import  org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
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

     @Nested
    @DisplayName("testing add func")
    class AddTesing{
        @Test
        @DisplayName("test positve")
        void testAddingPositiveNumbers(){
            assertEquals(4,mu.add(2,2),"adding positve numbers not working");
        }
        @Test
        @DisplayName("test negetive")
       // @DisplayNameGeneration(DisplayNameGenerator.class ,simple)
        void testAddingNegetiveNumbers(){
            assertEquals(-4,mu.add(-2,-2),"adding negative numbers not working");
        }

    }


    @Test
    @DisplayName("adding 2 numbers")
    void add() {
        Assumptions.assumeTrue(true);
        int add = mu.add(2, 2);
        assertEquals(4, add);
        assertAll(
                ()->assertEquals(4,mu.add(2, 2)),
                ()->assertEquals(-4,mu.add(-2, -2)


        ));
    }

    @Test
    @DisplayName("area of a circle with radius")
    void area() {
        double area = mu.area(5);
        assertEquals(78.53981633974483, area, "expected area is not equal to actual");
    }

    @Test
    void testDivide() {
        assertEquals(5, mu.divide(1));
    }

    @Test
    void testDivideException() {

        assertThrows(ArithmeticException.class, () -> mu.divide(0), "execption throwed");
    }
}