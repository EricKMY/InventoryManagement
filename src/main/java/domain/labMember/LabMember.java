package domain.labMember;

import domain.inventory.ILabInventory;
import domain.inventory.ILabInventoryList;

import java.util.UUID;

public class LabMember implements ILabMember {
    private String name;
    private String id;
    private String phone;
    private String email;
    private String password;
    protected String permission;

    //new
    public LabMember() {
        this.id = UUID.randomUUID().toString();
    }

    public LabMember(String name, String email, String password) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public String getPermission() {
        return permission;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPermission(String permission){
      this.permission = permission;
    };

    //While using DB to get LabMember need use.
    public void setId(String id) {
      this.id = id;
    }

    //remove
//    public boolean setUserPermission(ILabMember labMember, String permission) {
//        return true;
//    }
//    public ILabInventoryList readInventoryList() {
//        return null;
//    }
//    public ILabInventory readInventory(String id) {
//        return null;
//    }
}
