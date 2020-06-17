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

    //change
    @Override
    public boolean changeUserPermission(String permission, ILabMember labMember) {
        labMemberMap.get(labMember.getId()).setPermission(permission);
        return true;
    }

    @Override
    public boolean changePassword(String password, ILabMember labMember) {
        labMemberMap.get(labMember.getId()).setPassword(password);
        return true;
    }

    @Override
    public boolean updateUserInfo(String name, String email, String phone, ILabMember labMember) {
        labMemberMap.get(labMember.getId()).setName(name);
        labMemberMap.get(labMember.getId()).setEmail(email);
        labMemberMap.get(labMember.getId()).setPhone(phone);
        return true;
    }
}
