package com.flamelq.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Ihar Kharuzhy
 * 3/30/2018.
 */
public class CategoryTest {


    Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void getId() {
        Long id = 4L;

        category.setId(id);

        Assert.assertEquals(id, category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}