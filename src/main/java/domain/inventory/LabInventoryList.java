package domain.inventory;

import domain.labMember.ILabMember;

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

    public boolean createCategory(String category, ILabMember labMember){
        labInventoryMap.put(category, new ArrayList<ILabInventory>());
        return true;
    }

    //diff
    public boolean updateCategoryName(String oCategory, String nCategory, ILabMember labMember){
        if( !labInventoryMap.containsKey(oCategory) ) return false;
        List<ILabInventory> l = labInventoryMap.get(oCategory);
        for(int i=0; i<l.size(); i++) l.get(i).setCategory(nCategory);

        labInventoryMap.put(nCategory, l);
        labInventoryMap.remove(oCategory);
        return true;
    }

    public boolean deleteCategory(String category, ILabMember labMember){
        if( !labInventoryMap.containsKey(category) ) return false;
        labInventoryMap.remove(category);
        return true;
    }

    public boolean createInventory(String category, String inventoryName, int amount, ILabMember labMember) {
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
        if(reader == null) return null;
        else for (ILabInventory l : reader) if (l.getName() == inventoryName) return l;
        return null;
    }

    public boolean updateInventoryAmount(String category, String inventoryName, int amount, ILabMember labMember) {
        List<ILabInventory> reader = labInventoryMap.get(category);
        for (ILabInventory l : reader) {
            if (l.getName() == inventoryName) {
                l.setAmount(amount);
                return true;
            }
        }
        return false;
    }

    public boolean updateInventoryName(String category, String oInventoryName, String nInventoryName, ILabMember labMember) {
        List<ILabInventory> reader = labInventoryMap.get(category);
        for (ILabInventory l : reader) {
            if (l.getName() == oInventoryName) {
                l.setName(nInventoryName);
                return true;
            }
        }
        return false;
    }

    public boolean deleteInventory(String category, String inventoryName, ILabMember labMember){
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