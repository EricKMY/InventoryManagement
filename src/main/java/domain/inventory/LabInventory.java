package domain.inventory;

import domain.labMember.ILabMember;
import domain.labMember.LabMember;
import domain.notificationInfo.INotificationInfo;
import domain.notificationInfo.NotificationInfo;

import java.util.UUID;

public class LabInventory implements ILabInventory{
    private String id;
    private String name;
    private String category;
    private int amount;
    private int limitNum;
    private ILabMember personInCharge;
    private INotificationInfo notificationInfo;

    public LabInventory(String category, String name, int amount, ILabMember personInCharge){
        this.name = name;
        this.category = category;
        this.amount = amount;
        this.personInCharge = personInCharge;
        this.id = UUID.randomUUID().toString();
        this.limitNum = -1;

        //diff
        notificationInfo = new NotificationInfo(name);
    }

    public boolean isUnderLimit(){
        //diff from design class model
        return amount < limitNum ? true:false;
    }

    public void add(int amount){
        this.amount += amount;
    }

    public void minus(int amount){
        this.amount -= amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(int limitNum) {
        this.limitNum = limitNum;
    }

    public ILabMember getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(ILabMember personInCharge) {
        this.personInCharge = personInCharge;
    }

    //diff
    public INotificationInfo getNotificationInfo() {
        return notificationInfo;
    }
}
