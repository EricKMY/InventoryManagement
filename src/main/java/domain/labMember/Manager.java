package domain.labMember;

public class Manager extends LabMember {
    //Using DB need;
    public Manager() {
        super();
    }

    public Manager(String name, String email, String password) {
        super(name, email, password);
        this.permission = "Manager";
    }
}
