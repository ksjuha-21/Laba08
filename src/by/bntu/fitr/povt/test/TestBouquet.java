package by.bntu.fitr.povt.test;

import by.bntu.fitr.povt.model.Bouquet;
import by.bntu.fitr.povt.model.product.flowers.Iris;
import by.bntu.fitr.povt.model.product.flowers.Rose;
import by.bntu.fitr.povt.model.product.flowers.Tulip;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TestBouquet {

    private Bouquet bouquet;

    @Before
    public void initTest() {
        bouquet = new Bouquet();
        bouquet.add(new Rose("Red"));
        bouquet.add(new Iris("White"));
        bouquet.add(new Tulip("Purple"));
    }

    @After
    public void afterTest() {
        bouquet = null;
    }

    @Test
    public void testGetSortBouquet() throws Exception {
        assertNotNull(bouquet.getSortBouquet());
    }


}
