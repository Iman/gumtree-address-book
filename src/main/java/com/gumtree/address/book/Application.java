package com.gumtree.address.book;


import com.gumtree.address.book.service.AddressBookKPI;
import com.gumtree.address.book.service.Gender;

public class Application {

    public static void main(String[] args) throws Exception {
        AddressBookKPI addressBookKPI = new AddressBookKPI();

        Gender gender = Gender.MALE;
        System.out.println("How many males are in the address book? " + addressBookKPI.getHowManyGender(gender.getValue()));

        System.out.println("Who is the oldest person in the address book? " + addressBookKPI.getTheOldestPersonInAddressBook());

        System.out.println("How many days older is Bill than Paul? " + addressBookKPI.getDayDiffBetweenContacts("Bill McKnight", "Paul Robinson"));

    }
}
