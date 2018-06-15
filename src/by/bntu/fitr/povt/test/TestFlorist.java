package by.bntu.fitr.povt.test;

import by.bntu.fitr.povt.model.Florist;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TestFlorist {

    private static Florist florist;

    @Before
    public void initTest() {
        florist = new Florist();
    }

    @After
    public void afterTest() {
        florist = null;
    }

    @Test
    public void testCreateBouquet() throws NullPointerException {
        assertNotNull(florist.createBouquet("R", "Yellow"));
    }
}
