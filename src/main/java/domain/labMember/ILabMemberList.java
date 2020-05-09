package domain.labMember;

import java.util.Map;

public interface ILabMemberList {
    public Map<String, ILabMember> getLabMemberMap();
    public boolean addLabMember(ILabMember labMember);
    public boolean removeLabMemberById(String id);
    public ILabMember findLabMemberById(String id);
}
