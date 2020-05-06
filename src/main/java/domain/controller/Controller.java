package domain.controller;

import domain.inventory.LabInventory;
import domain.inventory.LabInventoryList;
import domain.labMember.LabMember;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Controller {

    private LabInventoryList labInventoryList;

    public Controller(){
        labInventoryList = new LabInventoryList();
    }

    public LabInventoryList getLabInventoryList(){
        return labInventoryList;
    }

    public boolean createCategory(String category, LabMember labMember){
        return labInventoryList.createCategory(category, labMember);
    }

    //diff
    public List<LabInventory> readCategory(String category){
        return labInventoryList.selectCategory(category);
    }

    //diff
    public boolean updateCategoryName(String oCategory, String nCategory, LabMember labMember){
        return labInventoryList.updateCategoryName(oCategory, nCategory, labMember);
    }

    public boolean deleteCategory(String category, LabMember labMember){
        return labInventoryList.deleteCategory(category, labMember);
    }

    public boolean createInventory(String category, String inventoryName, int amount, LabMember labMember){
        return labInventoryList.createInventory(category, inventoryName, amount, labMember);
    }

    // diff
    public LabInventory readInventory(String category, String inventoryName){
        return labInventoryList.readInventory(category, inventoryName);
    }

    // diff
    public boolean updateInventoryAmount(String category, String inventoryName, int amount, LabMember labMember){
        return labInventoryList.updateInventoryAmount(category, inventoryName, amount, labMember);
    }

    // diff
    public boolean updateInventoryName(String category, String oInventoryName, String nInventoryName, LabMember labMember){
        return labInventoryList.updateInventoryName(category, oInventoryName, nInventoryName, labMember);
    }

    public boolean deleteInventory(String category, String inventoryName, LabMember labMember){
        return labInventoryList.deleteInventory(category, inventoryName, labMember);
    }

    public boolean isInventoryUnderLimit(String category, String inventoryName){
        return labInventoryList.readInventory(category, inventoryName).isUnderLimit();
    }

    public boolean setUserPermission(LabMember labMember, String permission, LabMember targetLabMember){
        return labMember.setUserPermission(targetLabMember, permission);
    }
}
