package test.java.domain.notificationInfo;

import domain.notificationInfo.INotificationInfo;
import domain.notificationInfo.NotificationInfo;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NotificationInfoTest {

    @Test
    public void createNotificatinInfo() {
        INotificationInfo notificationInfo = new NotificationInfo("Wire");
        notificationInfo.setCurrentAmount("10");
        notificationInfo.setLimitAmount("5");
        notificationInfo.setLabMemberInfo("Eric");
        notificationInfo.setReplenishmentAmount("20");
        notificationInfo.setTaxID("12345");

        assertEquals("10", notificationInfo.getCurrentAmount());
        assertEquals("5", notificationInfo.getLimitAmount());
        assertEquals("Eric", notificationInfo.getLabMemberInfo());
        assertEquals("20", notificationInfo.getReplenishmentAmount());
        assertEquals("12345", notificationInfo.getTaxID());
    }
}
