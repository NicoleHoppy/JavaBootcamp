package pl.javaexercises.week04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex04IsEmptyTest {

    @Test
    void testIsEmptyWhenEmpty() {assertTrue(Ex04IsEmpty.isEmpty(""));}

    @Test
    void testIsNullWhenNull() {assertTrue(Ex04IsEmpty.isEmpty(null));}

    @Test
    void testStringWithSomethingInside() {assertFalse(Ex04IsEmpty.isEmpty("Hello"));}
}
