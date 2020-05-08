package domain.notificationInfo;

import java.util.ArrayList;
import java.util.List;


public class NotificationInfo implements INotificationInfo {

    private String limitAmount = "";
    private String inventoryName = "";
    private String labMemberInfo = "";
    private String inventoryPrice = "";
    private String taxID = "";
    private String currentAmount = "";
    private String replenishmentAmount = "";
//    private List<String> notificationList;

    public NotificationInfo(String inventoryName) {
        this.inventoryName = inventoryName;
//        notificationList = new ArrayList<String>();
    }

//    public boolean setNotificationInfo(String limitAmount, String taxId, String replenishmentAmount, String personInCharge) {
//        this.limitAmount = limitAmount;
//        this.replenishmentAmount = replenishmentAmount;
//        this.labMemberInfo = personInCharge;
//        this.taxID = taxId;
//        return true;
//    }


//    public Boolean setInventoryNotificationInfo(String name, List<String> info) {
//        inventoryName = name;
//        labMemberInfo = info.get(0);
//        inventoryPrice = info.get(1);
//        taxID = info.get(2);
//        currentAmount = info.get(3);
//        replenishmentAmount = info.get(4);
//
//        String str = info.get(5);
//        String[] tokens = str.split(",");
//        for(String token:tokens) {
//            notificationList.add(token);
//        }
//
//        return  true;
//    }


    public String getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(String limitAmount) {
        this.limitAmount = limitAmount;
    }

    public String getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    public String getLabMemberInfo() {
        return labMemberInfo;
    }

    public void setLabMemberInfo(String labMemberInfo) {
        this.labMemberInfo = labMemberInfo;
    }

    public String getInventoryPrice() {
        return inventoryPrice;
    }

    public void setInventoryPrice(String inventoryPrice) {
        this.inventoryPrice = inventoryPrice;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public String getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(String currentAmount) {
        this.currentAmount = currentAmount;
    }

    public String getReplenishmentAmount() {
        return replenishmentAmount;
    }

    public void setReplenishmentAmount(String replenishmentAmount) {
        this.replenishmentAmount = replenishmentAmount;
    }

//    public List<String> getNotificationList() {
//        return notificationList;
//    }
//
//    public void setNotificationList(List<String> notification) {
//        this.notificationList = notification;
//    }
}
