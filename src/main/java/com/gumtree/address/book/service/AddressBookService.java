package com.gumtree.address.book.service;

import com.gumtree.address.book.model.AddressBook;

import java.util.List;

public interface AddressBookService {
    public List<AddressBook> getAddressBookList() throws Exception;
}
