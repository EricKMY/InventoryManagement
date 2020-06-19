package test.java.domain.labMember;

import domain.labMember.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LabMemberListTest {
    private ILabMemberList labMemberList;
    private ILabMember labMember;

    @Before
    public void setup() {
        labMember = new Manager("Jeff", "Jeff@gmail.com", "jeff123");
        labMemberList = new LabMemberList();
    }

    @Test
    public void addLabMemberToLabMemberList() {
        assertEquals(0, labMemberList.getLabMemberMap().size());
        labMemberList.addLabMember(labMember);
        assertEquals(1, labMemberList.getLabMemberMap().size());
        assertEquals("Jeff", labMemberList.findLabMemberById(labMember.getId()).getName());
        assertEquals("Jeff@gmail.com", labMemberList.findLabMemberById(labMember.getId()).getEmail());
        assertEquals("jeff123", labMemberList.findLabMemberById(labMember.getId()).getPassword());
    }

    @Test
    public void removeLabMemberToLabMemberList() {
        assertEquals(0, labMemberList.getLabMemberMap().size());
        labMemberList.addLabMember(labMember);
        assertEquals(1, labMemberList.getLabMemberMap().size());
        labMemberList.removeLabMemberById(labMember.getId());
        assertEquals(0, labMemberList.getLabMemberMap().size());
    }

    @Test
    public void changeManagerPermission() {
        labMemberList.addLabMember(labMember);
        assertEquals("Manager", labMemberList.findLabMemberById(labMember.getId()).getPermission());
        labMemberList.changeUserPermission("Admin", labMemberList.findLabMemberById(labMember.getId()));
        assertEquals("Admin", labMemberList.findLabMemberById(labMember.getId()).getPermission());
    }

    @Test
    public void changeManagerPassword() {
        labMemberList.addLabMember(labMember);
        assertEquals("jeff123", labMemberList.findLabMemberById(labMember.getId()).getPassword());
        labMemberList.changePassword("jeff456", labMemberList.findLabMemberById(labMember.getId()));
        assertEquals("jeff456", labMemberList.findLabMemberById(labMember.getId()).getPassword());
    }

    @Test
    public void updateManagerUserInfo() {
        labMemberList.addLabMember(labMember);
        assertEquals("Jeff", labMemberList.findLabMemberById(labMember.getId()).getName());
        assertEquals("Jeff@gmail.com", labMemberList.findLabMemberById(labMember.getId()).getEmail());
        assertEquals(null, labMemberList.findLabMemberById(labMember.getId()).getPhone());
        labMemberList.updateUserInfo("Jeff2", "Jeff2@gmail.com", "0909090909", labMemberList.findLabMemberById(labMember.getId()));
        assertEquals("Jeff2", labMemberList.findLabMemberById(labMember.getId()).getName());
        assertEquals("Jeff2@gmail.com", labMemberList.findLabMemberById(labMember.getId()).getEmail());
        assertEquals("0909090909", labMemberList.findLabMemberById(labMember.getId()).getPhone());
    }
}
