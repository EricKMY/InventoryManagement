package test.java.domain.controller;

import domain.controller.Controller;
import domain.controller.IController;
import domain.inventory.ILabInventory;
import domain.labMember.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerTest {
    private ILabMember labMember;
    private IController controller;

    @Before
    public void setup(){
        labMember = new Manager("Bill", "xxx@gmail.com", "123");
        controller = new Controller();
    }

    @Test
    public void createInventoryTest(){
        controller.createInventory("groceries", "tissue", 1, labMember);
        assertEquals("tissue", controller.getLabInventoryList().selectCategory("groceries").get(0).getName());
    }

    @Test
    public void readInventoryTest(){
        controller.createInventory("groceries", "tissue", 1, labMember);
        ILabInventory reader = controller.readInventory("groceries", "tissue");
        assertEquals("tissue", reader.getName());
    }

    @Test
    public void updateInventoryAmountTest(){
        controller.createInventory("groceries", "tissue", 1, labMember);
        controller.updateInventoryAmount("groceries", "tissue", 5, labMember);
        assertEquals(5, controller.readInventory("groceries", "tissue").getAmount());
    }

    @Test
    public void updateInventoryNameTest(){
        controller.createInventory("groceries", "tissue", 1, labMember);
        controller.updateInventoryName("groceries", "tissue", "new tissue", labMember);
        assertEquals("new tissue", controller.readInventory("groceries", "new tissue").getName());
    }

    @Test
    public void deleteInventoryNameTest(){
        controller.createInventory("groceries", "tissue", 1, labMember);
        assertNotNull(controller.readInventory("groceries", "tissue"));
        controller.deleteInventory("groceries", "tissue", labMember);
        assertNull(controller.readInventory("groceries", "tissue"));
    }

    @Test
    public void isInventoryUnderLimitTest(){
        controller.createInventory("groceries", "tissue", 1, labMember);
        controller.readInventory("groceries", "tissue").setLimitNum(3);
        assertTrue(controller.isInventoryUnderLimit("groceries", "tissue"));
        controller.updateInventoryAmount("groceries", "tissue", 5, labMember);
        assertFalse(controller.isInventoryUnderLimit("groceries", "tissue"));
    }

    @Test
    public void createAndReadCategoryTest(){
        controller.createCategory("groceries", labMember);
        assertNotNull(controller.readCategory("groceries"));
        assertEquals(0, controller.readCategory("groceries").size());
    }

    @Test
    public void updateCategoryNameTest(){
        controller.createCategory("groceries", labMember);
        controller.createInventory("groceries", "tissue", 2, labMember);
        controller.updateCategoryName("groceries", "new groceries", labMember);
        assertNull(controller.readCategory("groceries"));
        assertNotNull(controller.readCategory("new groceries"));
        assertEquals("tissue", controller.readCategory("new groceries").get(0).getName());
    }

    @Test
    public void deleteCategoryTest(){
        controller.createCategory("groceries", labMember);
        assertNotNull(controller.readCategory("groceries"));
        controller.deleteCategory("groceries", labMember);
        assertNull(controller.readCategory("groceries"));
    }

//    @Test
//    public void setUserPermissionTest() {
//        ILabMember labMember = new Admin("Jeff", "jeff@gmail.com", "123");
//        ILabMember newLabMember = new Viewer("newJeff", "newJeff@gmail.com", "456");
//        assertEquals("Viewer", newLabMember.getPermission());
//        controller.setUserPermission("Manager", newLabMember);
//        assertEquals("Manager", newLabMember.getPermission());
//
//        assertEquals("Admin", labMember.getPermission());
//        controller.setUserPermission("Manager", labMember);
//        assertEquals("Admin", labMember.getPermission());
//    }

}
