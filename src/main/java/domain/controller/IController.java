package domain.controller;

import domain.inventory.ILabInventory;
import domain.inventory.LabInventory;
import domain.inventory.ILabInventoryList;
import domain.labMember.ILabMember;
import domain.labMember.LabMember;

import java.util.List;

public interface IController {
    public ILabInventoryList getLabInventoryList();
    public boolean createCategory(String category, ILabMember labMember);
    public List<ILabInventory> readCategory(String category);
    public boolean updateCategoryName(String oCategory, String nCategory, ILabMember labMember);
    public boolean deleteCategory(String category, ILabMember labMember);
    public boolean createInventory(String category, String inventoryName, int amount, ILabMember labMember);
    public ILabInventory readInventory(String category, String inventoryName);
    public boolean updateInventoryAmount(String category, String inventoryName, int amount, ILabMember labMember);
    public boolean updateInventoryName(String category, String oInventoryName, String nInventoryName, ILabMember labMember);
    public boolean deleteInventory(String category, String inventoryName, ILabMember labMember);
    public boolean isInventoryUnderLimit(String category, String inventoryName);
    public boolean setUserPermission(ILabMember labMember, String permission, ILabMember targetLabMember);
}
