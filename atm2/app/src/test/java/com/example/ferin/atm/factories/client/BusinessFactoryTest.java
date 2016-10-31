package com.example.ferin.atm.factories.client;

import com.example.ferin.atm.domain.client.impl.Business;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ferin on 2016-10-31.
 */
public class BusinessFactoryTest {

    Business business;

    @Before
    public void setUp() throws Exception {
        business = BusinessFactory.createBusinessClient("9403300", "taylor", "a@gmail.com");
    }

    @Test
    public void testNull() throws Exception {
        Assert.assertNotNull(business);
    }

    @Test
    public void testValue() throws Exception {
        Assert.assertEquals(business.getName(), "taylor");
    }

    @Test
    public void testUpdate() throws Exception {
        Business businessUpdate;

        businessUpdate = new Business.Builder()
                .copy(business)
                .name("kim")
                .build();

        Assert.assertEquals(businessUpdate.getName(), "kim");
    }

}
