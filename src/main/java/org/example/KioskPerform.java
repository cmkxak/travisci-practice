package org.example;

import java.util.ArrayList;

public class KioskPerform {
    private String menu;
    private Kiosk kiosk;

    public void setKiosk(Kiosk kiosk){
        this.kiosk = kiosk;
    }

    public String doOrder(String menu) {
        this.menu = menu;
        return kiosk.order(menu);
    }

    public String doCancel(String menu) {
        this.menu = menu;
        return kiosk.cancel(menu);
    }
    public int doCalculate(String menu){
        this.menu = menu;
        return kiosk.calculate(menu);
    }
}


