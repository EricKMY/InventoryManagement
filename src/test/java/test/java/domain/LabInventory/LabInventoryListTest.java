package test.java.domain.LabInventory;

import domain.inventory.ILabInventoryList;
import domain.inventory.LabInventoryList;
import domain.labMember.ILabMember;
import domain.labMember.LabMember;
import domain.labMember.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LabInventoryListTest {

    public ILabMember labMember;
    public ILabInventoryList labInventoryList;

    @Before
    public void setup(){
        labMember = new Manager("Bill", "xxx@gmail.com", "123");
        labInventoryList = new LabInventoryList();
    }

    @Test
    public void createAndSelectUniqueInventory(){
        labInventoryList.createInventory("groceries", "tissue", 1, labMember);
        assertEquals(1, labInventoryList.selectCategory("groceries").size());
        assertEquals("tissue", labInventoryList.selectCategory("groceries").get(0).getName());
    }

    @Test
    public void createAndSelectInventoryWithSameCategory(){
        labInventoryList.createInventory("groceries", "tissue", 1, labMember);
        assertEquals(1, labInventoryList.selectCategory("groceries").size());
        assertEquals("tissue", labInventoryList.selectCategory("groceries").get(0).getName());

        labInventoryList.createInventory("groceries", "water", 3, labMember);
        assertEquals(2, labInventoryList.selectCategory("groceries").size());
        assertEquals("tissue", labInventoryList.selectCategory("groceries").get(0).getName());
        assertEquals("water", labInventoryList.selectCategory("groceries").get(1).getName());
    }

    @Test
    public void createAndSelectInventoryWithDiffCategory(){
        labInventoryList.createInventory("groceries", "tissue", 1, labMember);
        assertEquals(1, labInventoryList.selectCategory("groceries").size());
        assertEquals("tissue", labInventoryList.selectCategory("groceries").get(0).getName());

        labInventoryList.createInventory("electronics", "computer", 3, labMember);
        assertEquals(2, labInventoryList.getLabInventoryMap().size());
        assertTrue(labInventoryList.getLabInventoryMap().containsKey("groceries"));
        assertTrue(labInventoryList.getLabInventoryMap().containsKey("electronics"));
    }

    @Test
    public void updateCategoryName(){
        labInventoryList.createInventory("groceries", "tissue", 1, labMember);
        labInventoryList.updateCategoryName("groceries", "new groceries", labMember);

        assertNull(labInventoryList.selectCategory("groceries"));
        assertNotNull(labInventoryList.selectCategory("new groceries"));
        assertEquals("new groceries", labInventoryList.readInventory("new groceries", "tissue").getCategory());
    }

    @Test
    public void deleteCategory(){
        labInventoryList.createInventory("groceries", "tissue", 1, labMember);
        labInventoryList.deleteCategory("groceries", labMember);

        assertNull(labInventoryList.getLabInventoryMap().get("groceries"));
        assertNull(labInventoryList.readInventory("groceries", "tissue"));
    }
}
