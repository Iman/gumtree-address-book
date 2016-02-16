package com.gumtree.address.book.service;

import com.gumtree.address.book.model.AddressBook;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AddressBookServiceImplTest {

    private AddressBookServiceImpl addressBookService;

    @Before
    public void setUp() throws Exception {
        this.addressBookService = new AddressBookServiceImpl();
    }

    @Test
    public void testGetAddressBookList() throws Exception {
        List<AddressBook> addressBooks = addressBookService.getAddressBookList();
        assertEquals(5, addressBooks.size());
    }


}