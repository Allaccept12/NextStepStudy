package com.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @BeforeEach
    public void setUp() {
        stringCalculator = new StringCalculator();
    }


    @Test
    @DisplayName("빈 문자열이거나 0 일때이거나 null일때")
    public void checkZeroStringAndOnlySpaceString() {
        assertEquals(0,stringCalculator.addString(" "));
        assertEquals(0,stringCalculator.addString("0"));
        assertEquals(0,stringCalculator.addString(null));
    }

    @Test
    @DisplayName("쉼표로 구분")
    public void separatorTest1() {
        assertEquals(10,stringCalculator.addString("1,2,3,4"));
    }

    @Test
    @DisplayName("콜론으로 구분")
    public void separatorTest2() {
        assertEquals(10,stringCalculator.addString("1:2:3:4"));
    }

    @Test
    @DisplayName("쉼표와 콜론으로 구분")
    public void sparatorTets3() {
        assertEquals(13, stringCalculator.addString("1,2:3:3,4"));
    }

    @Test
    @DisplayName("커스텀으로 추가한 구분자로 구분")
    public void separatorTest4() {
        assertEquals(5,stringCalculator.addString("//;\n1;3;1"));
    }

    @Test
    @DisplayName("음수 넣었을때 RuntimeException")
    public void stringSplitClassRuntimeException() {
        assertThrows(RuntimeException.class,
                () -> stringCalculator.addString("-1:2:3"));
    }



}
