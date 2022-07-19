## Memento Pattern

A Memento Pattern says that "to restore the state of an object to its previous state". But it must do this without
violating Encapsulation. Such case is useful in case of error or failure.

The Memento pattern is also known as Token.

Undo or backspace or ctrl+z is one of the most used operation in an editor. Memento design pattern is used to implement
the undo operation. This is done by saving the current state of the object as it changes state.

#### Benefits:

- It preserves encapsulation boundaries.
- It simplifies the originator.

![image](https://www.javatpoint.com/images/designpattern/memento-pattern.png)

1) Memento:
   Stores internal state of the originator object. The state can include any number of state variables.
   The Memento must have two interfaces, an interface to the caretaker. This interface must not allow any operations or
   any access to internal state stored by the memento and thus maintains the encapsulation. The other interface is
   Originator and it allows the Originator to access any state variables necessary to the originator to restore the
   previous state.
2) Originator:
   Creates a memento object that will capture the internal state of Originator.
   Use the memento object to restore its previous state.
3) Caretaker:
   Responsible for keeping the memento.
   The memento is transparent to the caretaker, and the caretaker must not operate on it.

## Implementation of Memento Pattern:

Step 1:

Create an Originator class that will use Memento object to restore its previous state.

```java
//This is a class.
public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento) {
        state = Memento.getState();
    }
}// End of the Originator class.
```  

Step 2:
Create a Memento class that will Store internal state of the Originator object.

```java
//This is a class.
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}// End of the Memento class.
```

Step 3:
Create a Caretaker class that will responsible for keeping the Memento.

```java
//This is a class.

import java.util.ArrayList;
import java.util.List;


public class Caretaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

}// End of the Caretaker class.
```

Step 4:
Create a MementoPatternDemo class.

```java
//This is a class.
public class MementoPatternDemo {

    public static void main(String[] args) {

        Originator originator = new Originator();

        Caretaker careTaker = new Caretaker();

        originator.setState("State #1");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(2));
        System.out.println("Third saved State: " + originator.getState());
    }

}
// End of the MementoPatternDemo class.
```  