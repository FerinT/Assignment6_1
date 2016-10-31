package com.example.ferin.atm.factories.client;

import com.example.ferin.atm.domain.client.ContactDetails;

/**
 * Created by Ferin on 2016-10-31.
 */
public class ContactDetailsFactory {

    public static ContactDetails createContactDetails(String cell, String email){
        ContactDetails contactDetails = new ContactDetails.Builder()
                .cellPhoneNumber(cell)
                .emailAddress(email)
                .build();

        return contactDetails;
    }

}
