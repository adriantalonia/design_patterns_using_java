## State Pattern

A State Pattern says that "the class behavior changes based on its state". In State Pattern, we create objects which
represent various states and a context object whose behavior varies as its state object changes.

### Benefits:

- It keeps the state-specific behavior.
- It makes any state transitions explicit.

![image](https://www.javatpoint.com/images/designpattern/state-pattern.png)

- **Context**: Defines an interface to client to interact. It maintains references to concrete state object which may be used to define current state of object.
- **State**: Defines interface for declaring what each concrete state should do.
- **ConcreteState**: Provides implementation for methods defined in State.


## Implementation of State Pattern:

Step 1:

Create a Connection interface that will provide the connection to the Controller class.

```java
//This is an interface.
public interface Connection {

    public void open();

    public void close();

    public void log();

    public void update();
}// End of the Connection interface.
```

Step 2:
Create an Accounting class that will implement to the Connection interface.

```java
//This is a class.  
public class Accounting implements Connection {

    @Override
    public void open() {
        System.out.println("open database for accounting");
    }

    @Override
    public void close() {
        System.out.println("close the database");
    }

    @Override
    public void log() {
        System.out.println("log activities");
    }

    @Override
    public void update() {
        System.out.println("Accounting has been updated");
    }
}// End of the Accounting class.
```  

Step 3:
Create a Sales class that will implement to the Connection interface.

```java
//This is a class.  
public class Sales implements Connection {

    @Override
    public void open() {
        System.out.println("open database for sales");
    }

    @Override
    public void close() {
        System.out.println("close the database");
    }

    @Override
    public void log() {
        System.out.println("log activities");
    }

    @Override
    public void update() {
        System.out.println("Sales has been updated");
    }

}// End of the Sales class.
```  

Step 4:
Create a Sales class that will implement to the Connection interface.

```java
//This is a class.
public class Sales implements Connection {

    @Override
    public void open() {
        System.out.println("open database for sales");
    }

    @Override
    public void close() {
        System.out.println("close the database");
    }

    @Override
    public void log() {
        System.out.println("log activities");
    }

    @Override
    public void update() {
        System.out.println("Sales has been updated");
    }
}// End of the Sales class.
```  

Step 5:
Create a Management class that will implement to the Connection interface.

```java
//This is a class.
public class Management implements Connection {

    @Override
    public void open() {
        System.out.println("open database for Management");
    }

    @Override
    public void close() {
        System.out.println("close the database");
    }

    @Override
    public void log() {
        System.out.println("log activities");
    }

    @Override
    public void update() {
        System.out.println("Management has been updated");
    }

}
// End of the Management class.
```  

Step 6:
Create a Controller class that will use the Connection interface for connecting with different types of connection.

```java
//This is a class.
public class Controller {

    public static Accounting acct;
    public static Sales sales;
    public static Management management;

    private static Connection con;

    Controller() {
        acct = new Accounting();
        sales = new Sales();
        management = new Management();
    }

    public void setAccountingConnection() {
        con = acct;
    }

    public void setSalesConnection() {
        con = sales;
    }

    public void setManagementConnection() {
        con = management;
    }

    public void open() {
        con.open();
    }

    public void close() {
        con.close();
    }

    public void log() {
        con.log();
    }

    public void update() {
        con.update();
    }


}// End of the Controller class.
```

Step 7:
Create a StatePatternDemo class.

```java
//This is a class.
public class StatePatternDemo {

    Controller controller;

    StatePatternDemo(String con) {
        controller = new Controller();
        //the following trigger should be made by the user  
        if (con.equalsIgnoreCase("management"))
            controller.setManagementConnection();
        if (con.equalsIgnoreCase("sales"))
            controller.setSalesConnection();
        if (con.equalsIgnoreCase("accounting"))
            controller.setAccountingConnection();
        controller.open();
        controller.log();
        controller.close();
        controller.update();
    }


    public static void main(String args[]) {

        new StatePatternDemo(args[0]);

    }

}// End of the StatePatternDemo class.  
```