package org.example;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooTest {

    @Test
    @DisplayName("Two string sum")
    public void testFooLogic1() {
        String expectedResult = "Fool1";
        FooClass fooClass = new FooClass("Fool", 1);
        assertEquals(expectedResult, fooClass.fooLogic1());
    }

    @Test
    @DisplayName("Many string sum")
    public void testFooLogic2() {
        String expectedResult = "FoolFoolFool";
        assertEquals(expectedResult, FooClass.fooLogic2("Fool", "Fool", "Fool"));
    }

    @Test
    @DisplayName("Wrong test")
    public void wrongAnswerTest(){
        assertEquals(true, false);
    }
}
