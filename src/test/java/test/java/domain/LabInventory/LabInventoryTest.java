package test.java.domain.LabInventory;

import domain.inventory.ILabInventory;
import domain.inventory.LabInventory;
import domain.labMember.LabMember;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LabInventoryTest {

    private ILabInventory labInventory;

    @Before
    public void setup(){
        LabMember labMember = new LabMember("Bill", "xxx@gmail.com", "123");
        labInventory = new LabInventory("groceries", "tissue", 1, labMember);
    }

    @Test
    public void inventoryAmountTest(){
        assertEquals(1, labInventory.getAmount());
        labInventory.add(1);
        assertEquals(2, labInventory.getAmount());
        labInventory.minus(1);
        assertEquals(1, labInventory.getAmount());
    }

    @Test
    public void inventoryLimitTest(){
        labInventory.setLimitNum(3);
        labInventory.setAmount(2);
        assertTrue(labInventory.isUnderLimit());
        labInventory.add(1);
        assertTrue(!labInventory.isUnderLimit());
    }
}
