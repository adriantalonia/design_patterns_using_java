## Bill Pugh Singleton

Prior to Java5, memory model had a lot of issues and above methods caused failure in certain scenarios in multithreaded
environment. So, Bill Pugh suggested a concept of inner static classes to use for singleton.

```java
// Java code for Bill Pugh Singleton Implementation
public class GFG {

    private GFG() {
// private constructor
    }

    // Inner class to provide instance of class
    private static class BillPughSingleton {
        private static final GFG INSTANCE = new GFG();
    }

    public static GFG getInstance() {
        return BillPughSingleton.INSTANCE;
    }
}
```