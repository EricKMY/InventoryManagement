package domain.labMember;

import java.util.Map;

public interface ILabMemberList {
    Map<String, ILabMember> getLabMemberMap();
    boolean addLabMember(ILabMember labMember);
    boolean removeLabMemberById(String id);
    ILabMember findLabMemberById(String id);

    //new
    boolean changeUserPermission(String permission, ILabMember labMember);
    boolean changePassword(String password, ILabMember labMember);
    boolean updateUserInfo(String name, String email, String phone, ILabMember labMember);
}
