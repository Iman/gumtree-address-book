package com.gumtree.address.book.utils;

import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class HelperTest {

    @Test
    public void testConvertStringToDate() throws Exception {
        assertEquals("Tue Feb 16 00:00:00 GMT 2016", Helper.convertStringToDate("16/02/2016").toString());
    }

    @Test(expected = ParseException.class)
    public void testConvertStringToDateWithException() throws ParseException {
        Helper.convertStringToDate("FOO102016");
    }
}