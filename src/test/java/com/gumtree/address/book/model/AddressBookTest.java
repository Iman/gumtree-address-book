package com.gumtree.address.book.model;

import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class AddressBookTest {

    private AddressBook addressBook;
    private final static String DATE_FORMAT = "dd/MM/yyyy";

    @Before
    public void setUp() throws Exception {
        DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT, Locale.ENGLISH);
        this.addressBook = new AddressBook();
        addressBook.setName("Fred");
        addressBook.setGender("Male");
        addressBook.setBirthDate(dateFormat.parse("14/08/1974"));
    }

    @Test
    public void testGetName() throws Exception {
        assertEquals("Fred", addressBook.getName());
    }

    @Test
    public void testGetGender() throws Exception {
        assertEquals("Male", addressBook.getGender());
    }

    @Test
    public void testGetBirthDate() throws Exception {
        assertEquals("Wed Aug 14 00:00:00 BST 1974", addressBook.getBirthDate().toString());
    }

}