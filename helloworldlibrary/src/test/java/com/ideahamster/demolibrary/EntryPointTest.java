package com.ideahamster.demolibrary;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Sridhar Nalam on 2020-01-23.
 */
public class EntryPointTest {

    @Test
    public void buildMyNewYearWishes() {
        Assert.assertEquals("Happy new year 2020", EntryPoint.getInstance().buildMyNewYearWishes(2020));
        Assert.assertNotEquals("Happy new year 2021", EntryPoint.getInstance().buildMyNewYearWishes(2020));
    }
}