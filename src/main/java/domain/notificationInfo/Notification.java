package domain.notificationInfo;

import domain.labMember.LabMember;

public class Notification {
    public Notification() {

    }

    public void sendAlert(String notificationInfo, LabMember personInCharge) {
        // connect with gmail api;
    };

    public void showAlert(String category, String inventoryName) {
        // connect with UI;
    };
}
