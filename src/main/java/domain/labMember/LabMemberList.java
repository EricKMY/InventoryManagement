package domain.labMember;

import java.util.HashMap;
import java.util.Map;

public class LabMemberList implements ILabMemberList {
    private Map<String, ILabMember> labMemberMap;

    public LabMemberList() {
        labMemberMap = new HashMap<String, ILabMember>();
    }

    public Map<String, ILabMember> getLabMemberMap() {
        return labMemberMap;
    }

    public boolean addLabMember(ILabMember labMember) {
        labMemberMap.put(labMember.getId(), labMember);
        return true;
    }

    public boolean removeLabMemberById(String id) {
        labMemberMap.remove(id);
        return true;
    }

    public ILabMember findLabMemberById(String id) {
        return labMemberMap.get(id);
    }

    @Override
    public boolean changeUserPermission(ILabMember targetLabMember, String permission) {
        return false;
    }

    @Override
    public boolean changePassword(ILabMember targetLabMember, String password) {
        return false;
    }
}
