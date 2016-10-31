package com.example.ferin.atm.factories.account;

import com.example.ferin.atm.domain.account.impl.Savings;
import com.example.ferin.atm.domain.client.Client;
import com.example.ferin.atm.domain.client.impl.Business;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ferin on 2016-10-31.
 */
public class SavingsFactoryTest {

    Savings savings;

    @Before
    public void setUp() throws Exception {
        Client client = new Business.Builder().build();
        savings = SavingsFactory.createCredit("123", new Double(250.50), new Double(100.00), "123", client);
    }

    @Test
    public void testNull() throws Exception {
        Assert.assertNotNull(savings);
    }

    @Test
    public void testValue() throws Exception {
        Assert.assertEquals(savings.getPin(), "123");
    }

    @Test
    public void testUpdate() throws Exception {
        Savings savingsUpdate;

        savingsUpdate = new Savings.Builder()
                .copy(savings)
                .pin("456")
                .build();

        Assert.assertEquals(savingsUpdate.getPin(), "456");

    }

}
