package test.java.domain.labMember;

import domain.labMember.LabMember;
import domain.labMember.LabMemberList;
import domain.labMember.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LabMemberListTest {
    private LabMemberList labMemberList;
    private LabMember labMember;

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
        assertEquals("Jeff", labMemberList.findLabMember(labMember.getId()).getName());
        assertEquals("Jeff@gmail.com", labMemberList.findLabMember(labMember.getId()).getEmail());
        assertEquals("jeff123", labMemberList.findLabMember(labMember.getId()).getPassword());
    }

    @Test
    public void removeLabMemberToLabMemberList() {
        assertEquals(0, labMemberList.getLabMemberMap().size());
        labMemberList.addLabMember(labMember);
        assertEquals(1, labMemberList.getLabMemberMap().size());
        labMemberList.removeLabMember(labMember.getId());
        assertEquals(0, labMemberList.getLabMemberMap().size());
    }
}
