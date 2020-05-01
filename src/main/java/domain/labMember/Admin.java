package main.java.domain.labMember;

public class Admin extends LabMember {
    public Admin(String name, String email, String password) {
        super(name, email, password);
        permission = "Admin";
    }

    public boolean isAdmin() {
        return permission.equals("Admin");
    }

    public boolean setUserPermission(LabMember labMember, String permission) {
        labMember.permission = permission;

        return true;
    }
}
