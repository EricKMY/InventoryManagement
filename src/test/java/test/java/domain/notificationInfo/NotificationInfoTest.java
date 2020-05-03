package test.java.domain.notificationInfo;

import domain.notificationInfo.NotificationInfo;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class NotificationInfoTest {

    @Test
    public void notificationInfoTest() {
        List<String> info = Arrays.asList("Eric", "100", "123", "3", "10", "Eric,Bill,Jeff");
        NotificationInfo notificationInfo = new NotificationInfo();
        notificationInfo.setInventoryNotificationInfo("Wire", info);
        assertEquals("Wire", notificationInfo.getInventoryName());
        assertEquals("Eric", notificationInfo.getLabMemberInfo());
        assertEquals("100", notificationInfo.getInventoryPrice());
        assertEquals("123", notificationInfo.getTaxID());
        assertEquals("3", notificationInfo.getCurrentAmount());
        assertEquals("10", notificationInfo.getReplenishmentAmount());
        assertEquals("Eric", notificationInfo.getNotificationList().get(0));
        assertEquals("Bill", notificationInfo.getNotificationList().get(1));
        assertEquals("Jeff", notificationInfo.getNotificationList().get(2));
    }
}
