## Command Pattern

> encapsulate a request under an object as a command and pass it to invoker object. Invoker object looks for the
> appropriate object which can handle this command and pass the command to the corresponding object and that object
> executes the command"

It is also known as Action or Transaction.

#### Advantage of command pattern

- It separates the object that invokes the operation from the object that actually performs the operation.
- It makes easy to add new commands, because existing classes remain unchanged.

#### Usage of command pattern:

It is used:

- When you need parameterize objects according to an action perform.
- When you need to create and execute requests at different times.
- When you need to support rollback, logging or transaction functionality.

![image](https://www.javatpoint.com/images/designpattern/commanduml.jpg)

- **Command** This is an interface for executing an operation.
- **ConcreteCommand** This class extends the Command interface and implements the execute method. This class creates a
  binding between the action and the receiver.
- **Client** This class creates the ConcreteCommand class and associates it with the receiver.
- **Invoker** This class asks the command to carry out the request.
- **Receiver** This class knows to perform the operation.

1) Create a ActionListernerCommand interface that will act as a Command.

```java
public interface ActionListenerCommand {
    public void execute();
}  
```

2) Create a Document class that will act as a Receiver.

```java
public class Document {
    public void open() {
        System.out.println("Document Opened");
    }

    public void save() {
        System.out.println("Document Saved");
    }
}  
```

3) Create a ActionOpen class that will act as an ConcreteCommand.

```java
public class ActionOpen implements ActionListenerCommand {
    private Document doc;

    public ActionOpen(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.open();
    }
}  
```

4) Create a ActionSave class that will act as an ConcreteCommand.

```java
public class ActionSave implements ActionListenerCommand {
    private Document doc;

    public ActionSave(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.save();
    }
} 
```

5) Create a MenuOptions class that will act as an Invoker.

```java
public class MenuOptions {
    ActionListenerCommand clickOpen;
    ActionListenerCommand clickSave;

    public MenuOptions(ActionListenerCommand clickOpen, ActionListenerCommand clickSave) {
        this.clickOpen = clickOpen;
        this.clickSave = clickSave;
    }

    public void clickOpen() {
        clickOpen.execute();
    }

    public void clickSave() {
        clickSave.execute();
    }
}  
```

6) Create a CommanPatternClient class that will act as a Client.

```java
public class CommandPatternClient {
    public static void main(String[] args) {
        Document doc = new Document();

        ActionListenerCommand clickOpen = new ActionOpen(doc);
        ActionListenerCommand clickSave = new ActionSave(doc);

        MenuOptions menu = new MenuOptions(clickOpen, clickSave);

        menu.clickOpen();
        menu.clickSave();
    }
}  
```
