package com.atr.principles.dependency_inversion;

interface Service {
    void write(String message);
}

class ServiceA implements Service {
    @Override
    public void write(String message) {
        System.out.println(message);
    }
}

class Client2 {
    private Service mysService;

    Client2(Service service) {
        this.mysService = service;
    }

    void doSomething() {
        mysService.write("Thi is a message");
    }

    void setService(Service service) {
        this.mysService = service;
    }
}

public class DependencyInversion3 {

    public static void main(String[] args) {
        Service service = new ServiceA(); // injector
        Client2 client2 = new Client2(service); // injects via the constructor
        client2.doSomething();

        client2.setService(service);
    }
}
