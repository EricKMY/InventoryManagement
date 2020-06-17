package domain.controller;

import domain.inventory.ILabInventory;
import domain.inventory.ILabInventoryList;
import domain.labMember.ILabMember;
import domain.labMember.ILabMemberList;

import java.util.List;

public interface IController {
    ILabInventoryList getLabInventoryList();
    ILabMemberList getLabMemberList();
    boolean createCategory(String category, ILabMember labMember);
    List<ILabInventory> readCategory(String category);
    boolean updateCategoryName(String oCategory, String nCategory, ILabMember labMember);
    boolean deleteCategory(String category, ILabMember labMember);
    boolean createInventory(String category, String inventoryName, int amount, ILabMember labMember);
    ILabInventory readInventory(String category, String inventoryName);
    boolean updateInventoryAmount(String category, String inventoryName, int amount, ILabMember labMember);
    boolean updateInventoryName(String category, String oInventoryName, String nInventoryName, ILabMember labMember);
    boolean deleteInventory(String category, String inventoryName, ILabMember labMember);
    boolean isInventoryUnderLimit(String category, String inventoryName);
    boolean changeUserPermission(String permission, ILabMember labMember);
    boolean changePassword(String password, ILabMember labMember);
    boolean updateUserInfo(String name, String email, String phone, ILabMember labMember);
    boolean addLabMember(ILabMember labMember);
}