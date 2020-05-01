package main.java.domain.labMember;

import main.java.domain.inventory.LabInventory;
import main.java.domain.inventory.LabInventoryList;

import java.util.UUID;

public class LabMember {
    private String name;
    private String id;
    private String phone;
    private String email;
    private String password;
    protected String permission;

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

    public boolean setUserPermission(LabMember labMember, String permission) {
        return true;
    }

    public LabInventoryList readInventoryList() {
        return null;
    }

    public LabInventory readInventory(String id) {
        return null;
    }
}
