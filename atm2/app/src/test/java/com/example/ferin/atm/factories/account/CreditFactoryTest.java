package com.example.ferin.atm.factories.account;

import com.example.ferin.atm.domain.account.impl.Credit;
import com.example.ferin.atm.domain.client.Client;
import com.example.ferin.atm.domain.client.impl.Business;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ferin on 2016-10-31.
 */
public class CreditFactoryTest {

    Credit credit;

    @Before
    public void setUp() throws Exception {
        Client client = new Business.Builder().build();
        credit = CreditFactory.createCredit("123", new Double(250.50), new Double(100.00), "123", client);
    }

    @Test
    public void testNull() throws Exception {
        Assert.assertNotNull(credit);
    }

    @Test
    public void testValue() throws Exception {
        Assert.assertEquals(credit.getPin(), "123");
    }

    @Test
    public void testUpdate() throws Exception {
        Credit creditUpdate;

        creditUpdate = new Credit.Builder()
                .copy(credit)
                .pin("456")
                .build();

        Assert.assertEquals(creditUpdate.getPin(), "456");

    }
}
