package domain.labMember;

import java.util.HashMap;
import java.util.Map;

public class LabMemberList implements ILabMemberList {
    private Map<String, LabMember> labMemberMap;

    public LabMemberList() {
        labMemberMap = new HashMap<String, LabMember>();
    }

    public Map<String, LabMember> getLabMemberMap() {
        return labMemberMap;
    }

    public boolean addLabMember(LabMember labMember) {
        labMemberMap.put(labMember.getId(), labMember);
        return true;
    }

    public boolean removeLabMemberById(String id) {
        labMemberMap.remove(id);
        return true;
    }

    public LabMember findLabMemberById(String id) {
        return labMemberMap.get(id);
    }
}
