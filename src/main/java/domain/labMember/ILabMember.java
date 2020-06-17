package domain.labMember;

import domain.inventory.ILabInventory;
import domain.inventory.ILabInventoryList;

public interface ILabMember {
    String getName();
    String getEmail();
    String getPhone();
    String getPassword();
    String getPermission();
    String getId();
    void setName(String name);
    void setId(String id);
    void setPhone(String phone);
    void setEmail(String email);
    void setPassword(String password);
    void setPermission(String permission);
//    boolean setUserPermission(ILabMember labMember, String permission);
//    ILabInventoryList readInventoryList();
//    ILabInventory readInventory(String id);
}
