package com.example.ferin.atm.factories.client;

import com.example.ferin.atm.domain.client.impl.Premium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ferin on 2016-10-31.
 */
public class PremiumFsctoryTest {

    Premium premium;

    @Before
    public void setUp() throws Exception {
        premium = PremiumFactory.createBusinessClient("9403300", "taylor", "a@gmail.com");
    }

    @Test
    public void testNull() throws Exception {
        Assert.assertNotNull(premium);
    }

    @Test
    public void testValue() throws Exception {
        Assert.assertEquals(premium.getName(), "taylor");
    }

    @Test
    public void testUpdate() throws Exception {
        Premium premiumUpdate;

        premiumUpdate = new Premium.Builder()
                .copy(premium)
                .name("kim")
                .build();

        Assert.assertEquals(premiumUpdate.getName(), "kim");
    }

}
