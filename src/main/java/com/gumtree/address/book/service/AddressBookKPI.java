package com.gumtree.address.book.service;


import com.gumtree.address.book.model.AddressBook;
import com.gumtree.address.book.utils.Helper;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class AddressBookKPI extends AddressBookServiceImpl {

    public int getHowManyGender(String gender) throws Exception {
        List<AddressBook> addressBooks = getAddressBookList();
        int count = 0;
        for (AddressBook addressBook : addressBooks) {
            if (addressBook.getGender().trim().equals(gender)) {
                count = count + 1;
            }
        }
        return count;
    }

    public String getTheOldestPersonInAddressBook() throws Exception {
        String name = null;
        List<AddressBook> addressBooks = getAddressBookList();
        Date maxDate = addressBooks.stream().map(u -> u.getBirthDate()).min(Date::compareTo).get();

        for (AddressBook addressbook : addressBooks) {
            if (addressbook.getBirthDate().equals(maxDate)) {
                name = addressbook.getName();
                break;
            }
        }
        return name;
    }

    public long getDayDiffBetweenContacts(String contactA, String contactB) throws Exception {
        List<AddressBook> addressBooks = getAddressBookList();
        AddressBook a = new AddressBook();
        AddressBook b = new AddressBook();

        addressBooks.forEach(item -> {
            if (contactA.equals(item.getName())) {
                a.setBirthDate(item.getBirthDate());
            }
        });
        addressBooks.forEach(item -> {
            if (contactB.equals(item.getName())) {
                b.setBirthDate(item.getBirthDate());
            }
        });

        return Helper.getTimeDiffFromTwoDate(a.getBirthDate(), b.getBirthDate());
    }
}
