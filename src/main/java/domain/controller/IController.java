package domain.controller;

import domain.inventory.ILabInventory;
import domain.inventory.LabInventory;
import domain.inventory.ILabInventoryList;
import domain.labMember.LabMember;

import java.util.List;

public interface IController {
    public ILabInventoryList getLabInventoryList();
    public boolean createCategory(String category, LabMember labMember);
    public List<ILabInventory> readCategory(String category);
    public boolean updateCategoryName(String oCategory, String nCategory, LabMember labMember);
    public boolean deleteCategory(String category, LabMember labMember);
    public boolean createInventory(String category, String inventoryName, int amount, LabMember labMember);
    public ILabInventory readInventory(String category, String inventoryName);
    public boolean updateInventoryAmount(String category, String inventoryName, int amount, LabMember labMember);
    public boolean updateInventoryName(String category, String oInventoryName, String nInventoryName, LabMember labMember);
    public boolean deleteInventory(String category, String inventoryName, LabMember labMember);
    public boolean isInventoryUnderLimit(String category, String inventoryName);
    public boolean setUserPermission(LabMember labMember, String permission, LabMember targetLabMember);
}
