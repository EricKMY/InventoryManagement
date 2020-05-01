package main.java.domain.labMember;

public class Manager extends LabMember {
    public Manager(String name, String email, String password) {
        super(name, email, password);
        this.permission = "Manager";
    }
}
