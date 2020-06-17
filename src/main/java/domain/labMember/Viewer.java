package domain.labMember;

public class Viewer extends LabMember {
    //Using DB need;
    public Viewer() {
        super();
    }

    public Viewer(String name, String email, String password) {
        super(name, email, password);
        permission = "Viewer";
    }
}
