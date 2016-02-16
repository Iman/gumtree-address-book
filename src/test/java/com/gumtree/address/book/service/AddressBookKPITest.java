package com.gumtree.address.book.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AddressBookKPITest {

    private AddressBookKPI addressBookKPI;

    @Before
    public void setUp() throws Exception {
        this.addressBookKPI = new AddressBookKPI();
    }

    @Test
    public void testGetHowManyGender() throws Exception {

        assertEquals(3, addressBookKPI.getHowManyGender("Male"));
        assertEquals(2, addressBookKPI.getHowManyGender("Female"));
        assertEquals(0, addressBookKPI.getHowManyGender("boo"));
    }

    @Test
    public void testGetTheOldestPersonInAddressBook() throws Exception {
        assertEquals("Wes Jackson", addressBookKPI.getTheOldestPersonInAddressBook());
    }

    @Test
    public void testGetDayDiffBetweenContacts() throws Exception {
        assertEquals(2862, addressBookKPI.getDayDiffBetweenContacts("Bill McKnight", "Paul Robinson"));
        assertEquals(0, addressBookKPI.getDayDiffBetweenContacts("Foo", "Bar"));
    }
}