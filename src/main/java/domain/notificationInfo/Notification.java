package domain.notificationInfo;

import domain.labMember.ILabMember;
import domain.labMember.LabMember;

public class Notification {
    public Notification() {

    }

    public void sendAlert(String notificationInfo, ILabMember personInCharge) {
        // connect with gmail api;
    };

    public void showAlert(String category, String inventoryName) {
        // connect with UI;
    };
}
