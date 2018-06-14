package by.bntu.fitr.povt.test;

import by.bntu.fitr.povt.model.product.flowers.Rose;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TestFlower {


    private static Rose rose;

    @BeforeClass
    public static void initTest() {
        rose = new Rose("Red");
    }

    @AfterClass
    public static void afterTest() {
        rose = null;
    }

    @Test
    public void testGetCost() throws NullPointerException {
        assertNotNull(rose.getCost());
    }

    @Test
    public void testGetName() throws NullPointerException {
        assertNotNull(rose.getName());
    }

    @Test
    public void testGetColor() throws NullPointerException {
        assertNotNull(rose.getColor());
    }


}
