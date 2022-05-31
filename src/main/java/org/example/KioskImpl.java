package org.example;
import java.util.ArrayList;

public class KioskImpl {
    private ArrayList<String> orderList;
    Kiosk kiosk;

    public KioskImpl(){
        orderList = new ArrayList<String>();
    }

    public void setKiosk(Kiosk kiosk){
        this.kiosk = kiosk;
    }

    public boolean order(String menu) {
        boolean addResult = orderList.add(menu);
        return addResult;
    }

    public boolean cancel(String menu) {
        if (orderList.isEmpty())
            return false;
        boolean removeResult = orderList.remove(menu);
        return removeResult;
    }

    public String getOrder() {
        if (orderList.isEmpty())
            return "주문하신 메뉴가 없습니다.";
        return "주문 목록 : " + orderList.toString();
    }
}


