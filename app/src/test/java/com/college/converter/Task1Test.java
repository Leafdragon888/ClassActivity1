package com.college.converter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Task1Test {
    @Test
    public void Test_String() {
        String actual = "@string/Result";
        String expected = "Result";
        assertEquals(expected, actual);
    }
}
