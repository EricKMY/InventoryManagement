package domain.labMember;

public class Admin extends LabMember {
    public Admin(String name, String email, String password) {
        super(name, email, password);
        this.permission = "Admin";
    }

    public boolean setUserPermission(ILabMember labMember, String permission) {

        labMember.setPermission(permission);
        return true;
    }
}
