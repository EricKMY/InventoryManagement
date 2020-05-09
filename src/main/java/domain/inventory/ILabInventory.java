package domain.inventory;

import domain.labMember.ILabMember;
import domain.labMember.LabMember;
import domain.notificationInfo.INotificationInfo;

public interface ILabInventory {

    public boolean isUnderLimit();

    public void add(int amount);

    public void minus(int amount);

    public String getId();

    public void setId(String id);

    public String getName();

    public void setName(String name);

    public String getCategory();

    public void setCategory(String category);

    public int getAmount();

    public void setAmount(int amount);

    public int getLimitNum();

    public void setLimitNum(int limitNum);

    public ILabMember getPersonInCharge();

    public void setPersonInCharge(ILabMember personInCharge);

    //diff
    public INotificationInfo getNotificationInfo();
}
