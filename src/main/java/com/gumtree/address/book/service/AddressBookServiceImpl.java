package com.gumtree.address.book.service;

import com.gumtree.address.book.model.AddressBook;
import com.gumtree.address.book.utils.Helper;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AddressBookServiceImpl implements AddressBookService {

    public List<AddressBook> getAddressBookList() throws Exception {
        InputStream in = AddressBookServiceImpl.class.getResourceAsStream("/AddressBook");
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder out = new StringBuilder();
        String line;
        List<AddressBook> addresses = new ArrayList<AddressBook>();
        while ((line = reader.readLine()) != null) {
            out.append(line);
            addresses.add(convertToAddressObject(line));
        }
        return addresses;
    }

    private AddressBook convertToAddressObject(String line) throws Exception {
        String addressObj[] = line.split(",");
        AddressBook address = new AddressBook();
        address.setName(addressObj[0]);
        address.setGender(addressObj[1]);
        address.setBirthDate(Helper.convertStringToDate(addressObj[2]));
        return address;
    }
}
