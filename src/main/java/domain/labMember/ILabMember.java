package main.java.domain.labMember;

import main.java.domain.inventory.LabInventory;
import main.java.domain.inventory.LabInventoryList;

public interface ILabMember {
    public String getName();
    public String getEmail();
    public String getPhone();
    public String getPassword();
    public String getPermission();
    public String getId();

    public void setName(String name);
    public void setPhone(String phone);
    public void setEmail(String email);
    public void setPassword(String password);
    public boolean setUserPermission(LabMember labMember, String permission);

    public LabInventoryList readInventoryList();
    public LabInventory readInventory(String id);
}
