## Mediator Pattern

A Mediator Pattern says that
> "to define an object that encapsulates how a set of objects interact".

I will explain the Mediator pattern by considering a problem. When we begin with development, we have a few classes and
these classes interact with each other producing results. Now, consider slowly, the logic becomes more complex when
functionality increases. Then what happens? We add more classes and they still interact with each other but it gets
really difficult to maintain this code now. So, Mediator pattern takes care of this problem.

Mediator pattern is used to reduce communication complexity between multiple objects or classes. This pattern provides a
mediator class which normally handles all the communications between different classes and supports easy maintainability
of the code by loose coupling.

### Benefits:

- It decouples the number of classes.
- It simplifies object protocols.
- It centralizes the control.
- The individual components become simpler and much easier to deal with because they don't need to pass messages to one
  another.
- The components don't need to contain logic to deal with their intercommunication and therefore, they are more generic.

![image](https://www.javatpoint.com/images/designpattern/mediator-pattern.png)

### Participants:

- **ApnaChatroom** :- defines the interface for interacting with participants.
- **ApnaChatroomImpl** :- implements the operations defined by the Chatroom interface. The operations are managing the
  interactions between the objects: when one participant sends a message, the message is sent to the other participants.
- **Participant** :- defines an interface for the users involved in chatting.
- **User1, User2, ...UserN** :- implements Participant interface; the participant can be a number of users involved in
  chatting. But each Participant will keep only a reference to the ApnaChatRoom.

### Implementation of Mediator Pattern:

Step 1:

Create a ApnaChatRoom interface.

```java
//This is an interface.  
public interface ApnaChatRoom {

    public void showMsg(String msg, Participant p);

}// End of the ApnaChatRoom interface.
```  

Step 2:

Create a ApnaChatRoomIml class that will implement ApnaChatRoom interface and will also use the number of participants
involved in chatting through Participant interface.

```java
//This is a class.  

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ApnaChatRoomImpl implements ApnaChatRoom {
    //get current date time   
    DateFormat dateFormat = new SimpleDateFormat("E dd-MM-yyyy hh:mm a");
    Date date = new Date();

    @Override
    public void showMsg(String msg, Participant p) {

        System.out.println(p.getName() + "'gets message: " + msg);
        System.out.println("\t\t\t\t" + "[" + dateFormat.format(date).toString() + "]");
    }
}// End of the ApnaChatRoomImpl class.
```  

Step 3:

Create a Participant abstract class.

```java
//This is an abstract class.  
public abstract class Participant {
    public abstract void sendMsg(String msg);

    public abstract void setname(String name);

    public abstract String getName();
}// End of the Participant abstract class.
```  

Step 4:

Create a User1 class that will extend Participant abstract class and will use the ApnaChatRoom interface.

```java
//This is a class.

public class User1 extends Participant {

    private String name;
    private ApnaChatRoom chat;

    @Override
    public void sendMsg(String msg) {
        chat.showMsg(msg, this);

    }

    @Override
    public void setname(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public User1(ApnaChatRoom chat) {
        this.chat = chat;
    }

}// End of the User1 class.
```  

Step 5:

Create a User2 class that will extend Participant abstract class and will use the ApnaChatRoom interface.

```java
//This is a class.

public class User2 extends Participant {

    private String name;
    private ApnaChatRoom chat;

    @Override
    public void sendMsg(String msg) {
        this.chat.showMsg(msg, this);

    }

    @Override
    public void setname(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public User2(ApnaChatRoom chat) {
        this.chat = chat;
    }


}
// End of the User2 class.
```  

Step 6:

Create a MediatorPatternDemo class that will use participants involved in chatting.

```java
//This is a class.

public class MediatorPatternDemo {

    public static void main(String args[]) {

        ApnaChatRoom chat = new ApnaChatRoomImpl();

        User1 u1 = new User1(chat);
        u1.setname("Ashwani Rajput");
        u1.sendMsg("Hi Ashwani! how are you?");


        User2 u2 = new User2(chat);
        u2.setname("Soono Jaiswal");
        u2.sendMsg("I am Fine ! You tell?");
    }

}/
```