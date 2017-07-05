package com.realdolmen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FractionParametrizedTest {
    @Parameter(0) public Fraction fractionSum;
    @Parameter(1) public Fraction fractionSum1;
    @Parameter(2) public Fraction fractionExpected;
    @Parameter(3) public Fraction fractionDifference;
    @Parameter(4) public Fraction fractionMultiplied;
    @Parameter(5) public Fraction fractionDivider;

    @Parameterized.Parameters
    public static Collection<Fraction[]> params(){
        return Arrays.asList(new Fraction[][] {
                {
                        new Fraction(1, 2),
                        new Fraction(1, 2),
                        new Fraction(1, 1),
                        new Fraction(0, 1),
                        new Fraction(1,4),
                        new Fraction(2,2)
                },
                {


                        new Fraction(3, 5),
                        new Fraction(1, 5),
                        new Fraction(4, 5),
                        new Fraction(2,5),
                        new Fraction(3,25),
                        new Fraction(15,5)
                },
                {

                        new Fraction(7,10),
                        new Fraction(5,10),
                        new Fraction(12,10),
                        new Fraction(2,10),
                        new Fraction(35,100),
                        new Fraction(70,50)

                }

    });

    }
    @Test
    public void shouldAddFraction(){
        assertEquals(fractionExpected,fractionSum.add(fractionSum1));

    }
    @Test
    public void shouldSubtractFraction(){
        assertEquals(fractionDifference,fractionSum.subtract(fractionSum1));

    }
    @Test
    public void shouldMultipliedFraction(){
        assertEquals(fractionMultiplied,fractionSum.muliply(fractionSum1));

    }
    @Test
    public void shouldDividFraction(){
        assertEquals(fractionDivider,fractionSum.divider(fractionSum1));
    }


}
