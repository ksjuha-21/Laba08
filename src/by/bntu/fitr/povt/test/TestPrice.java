package by.bntu.fitr.povt.test;

import by.bntu.fitr.povt.model.Bouquet;
import by.bntu.fitr.povt.model.Price;
import by.bntu.fitr.povt.model.product.flowers.Iris;
import by.bntu.fitr.povt.model.product.flowers.Rose;
import by.bntu.fitr.povt.model.product.flowers.Tulip;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrice {

    private Price price;
    private Bouquet bouquet;

    @Before
    public void initTest() {
        bouquet = new Bouquet();
        price = new Price();
        bouquet.add(new Rose("Red"));
        bouquet.add(new Iris("White"));
        bouquet.add(new Tulip("Purple"));
    }

    @After
    public void afterTest() {
        price = null;
        bouquet = null;
    }

    @Test
    public void testGetTotalPrice() throws Exception {
        assertEquals("Bouquet of flowers was not correct.", 4.55, price.getTotalPrice(bouquet), 0);
    }
}
