import org.example.Kiosk;
import org.example.KioskPerform;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class KioskTest {
    Kiosk mockedKiosk;
    KioskPerform kioskPerform;

    @BeforeEach
    void setUp(){
        mockedKiosk = mock(Kiosk.class);
        kioskPerform = new KioskPerform();
        kioskPerform.setKiosk(mockedKiosk);
    }
    @Test
    void orderTest(){
        String menu = "싸이버거";
        when(mockedKiosk.order(menu)).thenReturn(menu + "가 주문됨.");
        assertEquals(menu + "가 주문됨.", kioskPerform.doOrder(menu));
    }

    @Test
    void orderCancelTest(){
        String menu = "싸이버거";
        when(mockedKiosk.cancel(menu)).thenReturn(menu + "가 주문취소 됨.");
        assertEquals(menu + "가 주문취소 됨.", kioskPerform.doCancel(menu));
    }
    @Test
    void calculateTest(){
        String menu = "싸이버거";
        when(mockedKiosk.calculate("싸이버거")).thenReturn(4000);
        assertEquals(4000, kioskPerform.doCalculate(menu));
    }
}

















