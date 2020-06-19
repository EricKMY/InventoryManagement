package domain.notificationInfo;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


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

    public void sendAlert(final String from, final String password, String to, String sub, String msg) {
        //Get properties object
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        //get Session
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from,password);
                    }
                });
        //compose message
        try {
            MimeMessage message = new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject(sub);
            message.setText(msg);
            //send message
            Transport.send(message);
            System.out.println("message sent successfully");
        } catch (MessagingException e) {throw new RuntimeException(e);}

    }

//    public List<String> getNotificationList() {
//        return notificationList;
//    }
//
//    public void setNotificationList(List<String> notification) {
//        this.notificationList = notification;
//    }
}
