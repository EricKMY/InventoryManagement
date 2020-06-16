package domain.labMember;

import java.util.Map;

public interface ILabMemberList {
    Map<String, ILabMember> getLabMemberMap();
    boolean addLabMember(ILabMember labMember);
    boolean removeLabMemberById(String id);
    ILabMember findLabMemberById(String id);

    //new
    boolean changeUserPermission(ILabMember targetLabMember, String permission);
    boolean changePassword(ILabMember targetLabMember, String password);
}
