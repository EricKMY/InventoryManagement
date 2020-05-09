package domain.inventory;

import domain.labMember.ILabMember;
import domain.labMember.LabMember;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ILabInventoryList {

    public Map<String, List<ILabInventory>> getLabInventoryMap();

    public List<ILabInventory> selectCategory(String category);

    public boolean createCategory(String category, ILabMember labMember);

    //diff
    public boolean updateCategoryName(String oCategory, String nCategory, ILabMember labMember);

    public boolean deleteCategory(String category, ILabMember labMember);

    public boolean createInventory(String category, String inventoryName, int amount, ILabMember labMember);

    public ILabInventory readInventory(String category, String inventoryName);

    public boolean updateInventoryAmount(String category, String inventoryName, int amount, ILabMember labMember);

    public boolean updateInventoryName(String category, String oInventoryName, String nInventoryName, ILabMember labMember);

    public boolean deleteInventory(String category, String inventoryName, ILabMember labMember);
}
