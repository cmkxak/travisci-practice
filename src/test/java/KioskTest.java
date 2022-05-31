import org.example.Kiosk;
import org.example.KioskImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class KioskTest {
    Kiosk mockedKiosk;
    KioskImpl kiosk;

    @BeforeEach
    void setUp(){
        mockedKiosk = mock(Kiosk.class);
        kiosk = new KioskImpl();
        kiosk.setKiosk(mockedKiosk);
    }
    @Test
    void orderTest(){
        String menu = "싸이버거";
        when(mockedKiosk.order(menu)).thenReturn(true);
        assertTrue(mockedKiosk.order(menu));
    }
    @Test
    void orderCancelTest(){
        String menu = "싸이버거";
        Kiosk mockedKiosk = mock(Kiosk.class);
        when(mockedKiosk.cancel(menu)).thenReturn(true);
        assertTrue(mockedKiosk.cancel(menu));
    }
    @Test
    void getOrderListTest(){
        String order = mockedKiosk.getOrder();
        when(mockedKiosk.getOrder()).thenReturn("주문 목록 : " + order);
        assertEquals("주문 목록 : " + order, mockedKiosk.getOrder());
    }
}

















