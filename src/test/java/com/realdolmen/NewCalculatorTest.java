package com.realdolmen;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class NewCalculatorTest {
    @Test
    public void oneNumberReturnsNumber () {
        assertEquals(7, new Calculator().eval("7"));

    }
    @Test
    public void addingTwoNumbersShouldReturnSum (){
        assertEquals(12, new Calculator().eval("7 5"));
    }

}
