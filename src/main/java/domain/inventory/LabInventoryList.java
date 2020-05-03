package domain.inventory;

import domain.labMember.LabMember;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LabInventoryList {
    private Map<String, List<LabInventory>> labInventoryMap;

    public LabInventoryList() {
        labInventoryMap = new HashMap<String, List<LabInventory>>();
    }

    public Map<String, List<LabInventory>> getLabInventoryMap() {
        return labInventoryMap;
    }

    public List<LabInventory> selectCategory(String category) {
        return labInventoryMap.get(category);
    }

    public boolean createCategory(String category, LabMember labMember){
        labInventoryMap.put(category, new ArrayList<LabInventory>());
        return true;
    }

    //diff
    public boolean updateCategoryName(String oCategory, String nCategory, LabMember labMember){
        if( !labInventoryMap.containsKey(oCategory) ) return false;
        List<LabInventory> l = labInventoryMap.get(oCategory);
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
        LabInventory labInventory = new LabInventory(category, inventoryName, amount, labMember);

        if (labInventoryMap.containsKey(category)) {
            labInventoryMap.get(category).add(labInventory);
            return true;
        }

        List<LabInventory> newList = new ArrayList<LabInventory>();
        newList.add(labInventory);
        labInventoryMap.put(category, newList);

        return true;
    }

    public LabInventory readInventory(String category, String inventoryName) {
        List<LabInventory> reader = labInventoryMap.get(category);
        for (LabInventory l : reader) if (l.getName() == inventoryName) return l;
        return null;
    }

    public boolean updateInventoryAmount(String category, String inventoryName, int amount, LabMember labMember) {
        List<LabInventory> reader = labInventoryMap.get(category);
        for (LabInventory l : reader) {
            if (l.getName() == inventoryName) {
                l.setAmount(amount);
                return true;
            }
        }
        return false;
    }

    public boolean updateInventoryName(String category, String oInventoryName, String nInventoryName, LabMember labMember) {
        List<LabInventory> reader = labInventoryMap.get(category);
        for (LabInventory l : reader) {
            if (l.getName() == oInventoryName) {
                l.setName(nInventoryName);
                return true;
            }
        }
        return false;
    }

    public boolean deleteInventory(String category, String inventoryName, LabMember labMember){
        List<LabInventory> reader = labInventoryMap.get(category);
        for (LabInventory l : reader) {
            if (l.getName() == inventoryName) {
                reader.remove(l);
                return true;
            }
        }
        return false;
    }
}