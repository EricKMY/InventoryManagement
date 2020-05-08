package domain.notificationInfo;

public interface INotificationInfo {

    public String getLimitAmount();

    public void setLimitAmount(String limitAmount);

    public String getInventoryName();

    public void setInventoryName(String inventoryName);

    public String getLabMemberInfo();

    public void setLabMemberInfo(String labMemberInfo);

    public String getInventoryPrice();

    public void setInventoryPrice(String inventoryPrice);

    public String getTaxID();

    public void setTaxID(String taxID);

    public String getCurrentAmount();

    public void setCurrentAmount(String currentAmount);

    public String getReplenishmentAmount();

    public void setReplenishmentAmount(String replenishmentAmount);

//    public boolean setNotificationInfo(String limitAmount, String taxId, String replenishmentAmount, String personInCharge);
}