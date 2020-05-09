package domain.controller;

import domain.inventory.ILabInventory;
import domain.inventory.ILabInventoryList;
import domain.inventory.LabInventoryList;
import domain.labMember.ILabMember;
import domain.labMember.LabMember;

import java.util.List;

public class Controller implements IController {

    private ILabInventoryList labInventoryList;

    public Controller(){
        labInventoryList = new LabInventoryList();
    }

    public ILabInventoryList getLabInventoryList(){
        return labInventoryList;
    }

    public boolean createCategory(String category, ILabMember labMember){
        return labInventoryList.createCategory(category, labMember);
    }

    //diff
    public List<ILabInventory> readCategory(String category){
        return labInventoryList.selectCategory(category);
    }

    //diff
    public boolean updateCategoryName(String oCategory, String nCategory, ILabMember labMember){
        return labInventoryList.updateCategoryName(oCategory, nCategory, labMember);
    }

    public boolean deleteCategory(String category, ILabMember labMember){
        return labInventoryList.deleteCategory(category, labMember);
    }

    public boolean createInventory(String category, String inventoryName, int amount, ILabMember labMember){
        return labInventoryList.createInventory(category, inventoryName, amount, labMember);
    }

    // diff
    public ILabInventory readInventory(String category, String inventoryName){
        return labInventoryList.readInventory(category, inventoryName);
    }

    // diff
    public boolean updateInventoryAmount(String category, String inventoryName, int amount, ILabMember labMember){
        return labInventoryList.updateInventoryAmount(category, inventoryName, amount, labMember);
    }

    // diff
    public boolean updateInventoryName(String category, String oInventoryName, String nInventoryName, ILabMember labMember){
        return labInventoryList.updateInventoryName(category, oInventoryName, nInventoryName, labMember);
    }

    public boolean deleteInventory(String category, String inventoryName, ILabMember labMember){
        return labInventoryList.deleteInventory(category, inventoryName, labMember);
    }

    public boolean isInventoryUnderLimit(String category, String inventoryName){
        return labInventoryList.readInventory(category, inventoryName).isUnderLimit();
    }

    public boolean setUserPermission(ILabMember labMember, String permission, ILabMember targetLabMember){
        return labMember.setUserPermission(targetLabMember, permission);
    }
}
