package domain.labMember;

import java.util.Map;

public interface ILabMemberList {
    public Map<String, LabMember> getLabMemberMap();
    public boolean addLabMember(LabMember labMember);
    public boolean removeLabMemberById(String id);
    public LabMember findLabMemberById(String id);
}
