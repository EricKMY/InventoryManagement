package domain.labMember;

import java.util.HashMap;
import java.util.Map;

public class LabMemberList {
    private Map<String, LabMember> labMemberMap;

    public LabMemberList() {
        labMemberMap = new HashMap<String, LabMember>();
    }

    public void addLabMember(LabMember labMember) {
        labMemberMap.put(labMember.getId(), labMember);
    }

    public void removeLabMember(String id) {
        labMemberMap.remove(id);
    }

    public LabMember findLabMember(String id) {
        return labMemberMap.get(id);
    }
}
