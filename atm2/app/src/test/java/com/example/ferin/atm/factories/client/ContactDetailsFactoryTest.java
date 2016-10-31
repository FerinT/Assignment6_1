package com.example.ferin.atm.factories.client;

import com.example.ferin.atm.domain.client.ContactDetails;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ferin on 2016-10-31.
 */
public class ContactDetailsFactoryTest {

    ContactDetails contactDetails;

    @Before
    public void setUp() throws Exception {
        contactDetails = ContactDetailsFactory.createContactDetails("551", "a@gmail.com");
    }

    @Test
    public void testNull() throws Exception {
        Assert.assertNotNull(contactDetails);
    }

    @Test
    public void testValue() throws Exception {
        Assert.assertEquals(contactDetails.getCellPhoneNumber(), "551");
    }

    @Test
    public void testUpdate() throws Exception {
        ContactDetails contactDetailsUpdate = new ContactDetails.Builder()
                .copy(contactDetails)
                .cellPhoneNumber("123")
                .build();

        Assert.assertEquals(contactDetailsUpdate.getCellPhoneNumber(), "123");

    }
}
