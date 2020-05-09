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
}
