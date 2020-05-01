package test.java.domain.labMember;


import main.java.domain.labMember.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LabMemberTest {
    private LabMember labMember;
    private LabMemberList labMemberList;

    @Before
    public void setup() {
        labMemberList = new LabMemberList();
    }

    @Test
    public void createMemberAsManager() {
        labMember = new Manager("Jeff", "Jeff123@gmail.com", "Jeff111");
        assertEquals("Jeff", labMember.getName());
        assertEquals("Jeff123@gmail.com", labMember.getEmail());
        assertEquals("Jeff111", labMember.getPassword());
        assertEquals("Manager", labMember.getPermission());
    }

    @Test
    public void createMemberAsAdmin() {
        labMember = new Admin("Jeff", "Jeff123@gmail.com", "Jeff111");
        assertEquals("Jeff", labMember.getName());
        assertEquals("Jeff123@gmail.com", labMember.getEmail());
        assertEquals("Jeff111", labMember.getPassword());
        assertEquals("Admin", labMember.getPermission());
    }

    @Test
    public void createMemberAsViewer() {
        labMember = new Viewer("Jeff", "Jeff123@gmail.com", "Jeff111");
        assertEquals("Jeff", labMember.getName());
        assertEquals("Jeff123@gmail.com", labMember.getEmail());
        assertEquals("Jeff111", labMember.getPassword());
        assertEquals("Viewer", labMember.getPermission());
    }

    @Test
    public void addMemberToMemory() {
        labMember = new Manager("Jeff", "Jeff123@gmail.com", "Jeff111");
        labMemberList.addLabMember(labMember);

        assertEquals("Jeff", labMemberList.findLabMember(labMember.getId()).getName());
        assertEquals("Jeff123@gmail.com", labMemberList.findLabMember(labMember.getId()).getEmail());
        assertEquals("Jeff111", labMemberList.findLabMember(labMember.getId()).getPassword());
        assertEquals("Manager", labMemberList.findLabMember(labMember.getId()).getPermission());
    }

    @Test
    public void RemoveMemberFromMemory() {
        labMember = new Manager("Jeff", "Jeff123@gmail.com", "Jeff111");
        labMemberList.addLabMember(labMember);

        assertNotNull(labMemberList.findLabMember(labMember.getId()));

        labMemberList.removeLabMember(labMember.getId());

        assertNull(labMemberList.findLabMember(labMember.getId()));
    }
}
