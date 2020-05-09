package domain.inventory;

import domain.labMember.LabMember;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LabInventoryList implements ILabInventoryList{
    private Map<String, List<ILabInventory>> labInventoryMap;

    public LabInventoryList() {
        labInventoryMap = new HashMap<String, List<ILabInventory>>();
    }

    public Map<String, List<ILabInventory>> getLabInventoryMap() {
        return labInventoryMap;
    }

    public List<ILabInventory> selectCategory(String category) {
        return labInventoryMap.get(category);
    }

    public boolean createCategory(String category, LabMember labMember){
        labInventoryMap.put(category, new ArrayList<ILabInventory>());
        return true;
    }

    //diff
    public boolean updateCategoryName(String oCategory, String nCategory, LabMember labMember){
        if( !labInventoryMap.containsKey(oCategory) ) return false;
        List<ILabInventory> l = labInventoryMap.get(oCategory);
        labInventoryMap.put(nCategory, l);
        labInventoryMap.remove(oCategory);
        return true;
    }

    public boolean deleteCategory(String category, LabMember labMember){
        if( !labInventoryMap.containsKey(category) ) return false;
        labInventoryMap.remove(category);
        return true;
    }

    public boolean createInventory(String category, String inventoryName, int amount, LabMember labMember) {
        ILabInventory labInventory = new LabInventory(category, inventoryName, amount, labMember);

        if (labInventoryMap.containsKey(category)) {
            labInventoryMap.get(category).add(labInventory);
            return true;
        }

        List<ILabInventory> newList = new ArrayList<ILabInventory>();
        newList.add(labInventory);
        labInventoryMap.put(category, newList);

        return true;
    }

    public ILabInventory readInventory(String category, String inventoryName) {
        List<ILabInventory> reader = labInventoryMap.get(category);
        for (ILabInventory l : reader) if (l.getName() == inventoryName) return l;
        return null;
    }

    public boolean updateInventoryAmount(String category, String inventoryName, int amount, LabMember labMember) {
        List<ILabInventory> reader = labInventoryMap.get(category);
        for (ILabInventory l : reader) {
            if (l.getName() == inventoryName) {
                l.setAmount(amount);
                return true;
            }
        }
        return false;
    }

    public boolean updateInventoryName(String category, String oInventoryName, String nInventoryName, LabMember labMember) {
        List<ILabInventory> reader = labInventoryMap.get(category);
        for (ILabInventory l : reader) {
            if (l.getName() == oInventoryName) {
                l.setName(nInventoryName);
                return true;
            }
        }
        return false;
    }

    public boolean deleteInventory(String category, String inventoryName, LabMember labMember){
        List<ILabInventory> reader = labInventoryMap.get(category);
        for (ILabInventory l : reader) {
            if (l.getName() == inventoryName) {
                reader.remove(l);
                return true;
            }
        }
        return false;
    }
}