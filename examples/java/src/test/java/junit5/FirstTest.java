package junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class FirstTest {

    @Test
     void test() {
    }

    @Test
    @DisplayName("siva test @DisplayName")
     void test1() {
    }
    @Test
    @DisplayName("siva test addition")
    @ParameterizedTest(name = "For example, year {0} is not supported.")
    @ValueSource(ints = { -1, -4 })
     void testAddition( int a , int b) {


    }





}