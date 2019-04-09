import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void fizz() {
        assertEquals("fizz2019", FizzBuzz.fizzbuzz(3, ""));
    }

    @Test
    public void fuzz() {
        assertEquals("fuzz2019", FizzBuzz.fizzbuzz(5, ""));
    }

    @Test
    public void fizzfuzz() {
        assertEquals("fizz2019fuzz2019", FizzBuzz.fizzbuzz(15, ""));
    }

    @Test
    public void number_11() {
        assertEquals("11", FizzBuzz.fizzbuzz(11, ""));
    }

    @Test
    public void number_29() {
        assertEquals("29", FizzBuzz.fizzbuzz(29, ""));
    }

    @Test
    public void number_30() {
        assertEquals("fizz2019fuzz2019", FizzBuzz.fizzbuzz(30, ""));
    }

    @Test
    public void number_31() {
        assertEquals("31", FizzBuzz.fizzbuzz(31, ""));
    }
}