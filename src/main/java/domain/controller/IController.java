package domain.controller;

import domain.inventory.LabInventory;
import domain.inventory.LabInventoryList;
import domain.labMember.LabMember;
import domain.notificationInfo.INotificationInfo;
import domain.notificationInfo.NotificationInfo;

import java.util.List;

public interface IController {
    public LabInventoryList getLabInventoryList();
    public boolean createCategory(String category, LabMember labMember);
    public List<LabInventory> readCategory(String category);
    public boolean updateCategoryName(String oCategory, String nCategory, LabMember labMember);
    public boolean deleteCategory(String category, LabMember labMember);
    public boolean createInventory(String category, String inventoryName, int amount, LabMember labMember);
    public LabInventory readInventory(String category, String inventoryName);
    public boolean updateInventoryAmount(String category, String inventoryName, int amount, LabMember labMember);
    public boolean updateInventoryName(String category, String oInventoryName, String nInventoryName, LabMember labMember);
    public boolean deleteInventory(String category, String inventoryName, LabMember labMember);
    public boolean isInventoryUnderLimit(String category, String inventoryName);
    public boolean setUserPermission(LabMember labMember, String permission, LabMember targetLabMember);
//    public boolean setNotificationInfo(INotificationInfo notificationInfo, String limitAmount, String taxId, String replenishmentAmount, String personInCharge);
//    public boolean createNotificationInfo(LabInventory labInventory);
//    public NotificationInfo readNotificationInfo(String category, String inventoryName);
}
