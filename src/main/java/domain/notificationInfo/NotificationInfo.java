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
    }

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

    public void sendAlert() {

        final String from = "ntutlab1321mmc@gmail.com";
        final String password = "lab1321*";
        final String to = "erickuan970810edu@gmail.com";
        String sub;
        String msg;

        sub = "Please replenish " + inventoryName;
        msg = "Inventory Name: " + inventoryName + "\n"
            + "Current Amount: " + currentAmount + "\n"
            + "Replenishment Amount: " + replenishmentAmount + "\n"
            + "Price: " + inventoryPrice + "\n"
            + "Tax ID: " + taxID;

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
                        return new PasswordAuthentication(from, password);
                    }
                });
        //compose message
        try {
            MimeMessage message = new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(sub);
            message.setText(msg);
            //send message
            Transport.send(message);
            System.out.println("message sent successfully");
        } catch (MessagingException e) {throw new RuntimeException(e);}

    }

}
