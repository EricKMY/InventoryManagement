package test.java.domain.notificationInfo;

import domain.notificationInfo.Store;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StoreTest {

    @Test
    public void storeTest() {
        Store store = new Store("newtown");
        store.setAddress("taipei");
        store.setEmail("nt66start@gmail.com");
        store.setPhone("(02) 2351-8822");
        store.setWeb("https://nt66.com.tw/category.php?id=196");

        assertEquals("newtown", store.getName());
        assertEquals("taipei", store.getAddress());
        assertEquals("nt66start@gmail.com", store.getEmail());
        assertEquals("(02) 2351-8822", store.getPhone());
        assertEquals("https://nt66.com.tw/category.php?id=196", store.getWeb());
    }
}
