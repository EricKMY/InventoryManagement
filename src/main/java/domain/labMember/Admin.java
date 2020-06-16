package domain.labMember;

import domain.database.DataBaseConnector;

import java.sql.Connection;

public class Admin extends LabMember {
    public Admin() {
        super();
    }

    public Admin(String name, String email, String password) {
        super(name, email, password);
        this.permission = "Admin";
    }

    //remove
    public boolean setUserPermission(ILabMember labMember, String permission) {
        DataBaseConnector dataBaseConnector = new DataBaseConnector();
        Connection connection = dataBaseConnector.connect();
        labMember.setPermission(permission);
        return true;
    }
}
