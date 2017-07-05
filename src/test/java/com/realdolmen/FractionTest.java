package com.realdolmen;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FractionTest {

    private Fraction fraction;

    @Before
    public void init(){
        fraction = new Fraction(5,10);

    }

    @Test
    public void shouldCreateFraction () {
        assertNotNull(fraction);
        assertEquals(1,fraction.numerator());
        assertEquals(2,fraction.denominator());

    }
    @Test
    public void shouldSimplifyFraction () {
        assertNotNull(fraction);
        assertEquals(1,fraction.numerator());
        assertEquals(2,fraction.denominator());

    }
    @Test
    public void shouldPrintFraction () {
        assertNotNull(fraction);
        assertEquals("1/2",fraction.toString());

    }
}
