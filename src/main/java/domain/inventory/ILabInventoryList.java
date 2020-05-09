package domain.inventory;

import domain.labMember.LabMember;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ILabInventoryList {

    public Map<String, List<ILabInventory>> getLabInventoryMap();

    public List<ILabInventory> selectCategory(String category);

    public boolean createCategory(String category, LabMember labMember);

    //diff
    public boolean updateCategoryName(String oCategory, String nCategory, LabMember labMember);

    public boolean deleteCategory(String category, LabMember labMember);

    public boolean createInventory(String category, String inventoryName, int amount, LabMember labMember);

    public ILabInventory readInventory(String category, String inventoryName);

    public boolean updateInventoryAmount(String category, String inventoryName, int amount, LabMember labMember);

    public boolean updateInventoryName(String category, String oInventoryName, String nInventoryName, LabMember labMember);

    public boolean deleteInventory(String category, String inventoryName, LabMember labMember);
}
