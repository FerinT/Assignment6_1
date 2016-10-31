package com.example.ferin.atm.factories.client;

import com.example.ferin.atm.domain.client.impl.Standard;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ferin on 2016-10-31.
 */
public class StandardFactoryTest {

    Standard standard;

    @Before
    public void setUp() throws Exception {
        standard = StandardFactory.createBusinessClient("9403300", "taylor", "a@gmail.com");
    }

    @Test
    public void testNull() throws Exception {
        Assert.assertNotNull(standard);
    }

    @Test
    public void testValue() throws Exception {
        Assert.assertEquals(standard.getName(), "taylor");
    }

    @Test
    public void testUpdate() throws Exception {
        Standard standardUpdate;

        standardUpdate = new Standard.Builder()
                .copy(standard)
                .name("kim")
                .build();

        Assert.assertEquals(standardUpdate.getName(), "kim");
    }

}
