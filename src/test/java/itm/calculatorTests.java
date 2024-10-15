package itm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import itm.oss.Calculator;

@DisplayName("Calculator tests of OSS class")
public class calculatorTests {

    private final Calculator calc = new Calculator();

    @Test
    @DisplayName("Test for add function")
    void add(){
        assertEquals(13, calc.add(5,5), "Expected value is 10 in add function");
    }

    @Test
    @DisplayName("Test for isPrime function")
    void isfivePrime(){
        assertTrue(calc.isPrime(5), "5 is prime");
    }
    @Test
    @DisplayName("Test for isPrime function")
    void isfourprime(){
        assertFalse(calc.isPrime(4), "4 is not prime");
    }
}