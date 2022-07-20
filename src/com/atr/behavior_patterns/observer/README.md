## Observer Pattern

An Observer Pattern says that "just define a one-to-one dependency so that when one object changes state, all its
dependents are notified and updated automatically".

The observer pattern is also known as Dependents or Publish-Subscribe.

### Benefits:

- It describes the coupling between the objects and the observer.
- It provides the support for broadcast-type communication.

![image](https://static.javatpoint.com/images/designpattern/observer-pattern.png)

### Implementation of Observer Pattern

Step 1: Create a ResponseHandler1 class the will implement the java.util.Observer interface.

```java
//This is a class.

import java.util.Observable;
import java.util.Observer;

public class ResponseHandler1 implements Observer {
    private String resp;

    public void update(Observable obj, Object arg) {
        if (arg instanceof String) {
            resp = (String) arg;
            System.out.println("\nReceived Response: " + resp);
        }
    }
}// End of the ResponseHandler1 interface.
```

Step 2: Create a ResponseHandler2 class the will implement the java.util.Observer interface.

```java
//This is a class.

import java.util.Observable;
import java.util.Observer;

public class ResponseHandler2 implements Observer {
    private String resp;

    public void update(Observable obj, Object arg) {
        if (arg instanceof String) {
            resp = (String) arg;
            System.out.println("\nReceived Response: " + resp);
        }
    }
}// End of the ResponseHandler2 interface.
```

Step 3: Create an EventSource class that will extend the java.util.Observable class .

```java
//This is a class.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

public class EventSource extends Observable implements Runnable {
    @Override
    public void run() {
        try {
            final InputStreamReader isr = new InputStreamReader(System.in);
            final BufferedReader br = new BufferedReader(isr);
            while (true) {
                String response = br.readLine();
                setChanged();
                notifyObservers(response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}// End of the Eventsource class.  
```