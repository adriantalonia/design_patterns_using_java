package com.atr.principles.interface_segregation;

interface RestaurantInterface {
    void takeTelephoneOrder();
    void walkInCustomerOrder();
    void payInPerson();
}

interface RestaurantOnlineInterface {
    void payOnline();
    void acceptOnlineOrder();
}

class OnlineClientImpl implements RestaurantOnlineInterface {

    @Override
    public void payOnline() {

    }

    @Override
    public void acceptOnlineOrder() {

    }
}
public class InterfaceSegregation2 {
}
