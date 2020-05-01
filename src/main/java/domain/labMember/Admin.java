package main.java.domain.labMember;

public class Admin extends LabMember {
    public Admin(String name, String email, String password) {
        super(name, email, password);
        this.permission = "Admin";
    }

    public boolean setUserPermission(LabMember labMember, String permission) {

        labMember.permission = permission;
        return true;
    }
}
