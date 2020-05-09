package domain.labMember;

import domain.inventory.ILabInventory;
import domain.inventory.ILabInventoryList;

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
    public void setPermission(String permission);
    public boolean setUserPermission(ILabMember labMember, String permission);
    public ILabInventoryList readInventoryList();
    public ILabInventory readInventory(String id);
}
