## Template Pattern

A Template Pattern says that
> "just define the skeleton of a function in an operation, deferring some steps to its subclasses".

- Benefits:
  It is very common technique for reusing the code.This is only the main benefit of it.

- Usage:
  It is used when the common behavior among sub-classes should be moved to a single common class by avoiding the
  duplication.


![image](https://media.geeksforgeeks.org/wp-content/uploads/claasDia.jpg)

- AbstractClass contains the templateMethod() which should be made final so that it cannot be overridden. This template method makes use of other operations available in order to run the algorithm but is decoupled for the actual implementation of these methods. All operations used by this template method are made abstract, so their implementation is deferred to subclasses.
- ConcreteClass implements all the operations required by the templateMethod that were defined as abstract in the parent class. There can be many different ConcreteClasses.


![image](https://www.javatpoint.com/images/designpattern/template-pattern.png)

### Implementation of Template Pattern:

Step 1: Create a Game abstract class.

```java
//This is an abstract class.  
public abstract class Game {

    abstract void initialize();

    abstract void start();

    abstract void end();

    public final void play() {

        //initialize the game  
        initialize();

        //start game  
        start();

        //end game  
        end();
    }
}// End of the Game abstract class.
```

Step 2: Create a Chess class that will extend Game abstract class for giving the definition to its method.

```java
//This is a class.
public class Chess extends Game {
    @Override
    void initialize() {
        System.out.println("Chess Game Initialized! Start playing.");
    }

    @Override
    void start() {
        System.out.println("Game Started. Welcome to in the chess game!");
    }

    @Override
    void end() {
        System.out.println("Game Finished!");
    }
}// End of the Chess class.
```

Step 3: Create a Soccer class that will extend Game abstract class for giving the definition to its method.

```java
//This is a class.
public class Soccer extends Game {

    @Override
    void initialize() {
        System.out.println("Soccer Game Initialized! Start playing.");
    }

    @Override
    void start() {
        System.out.println("Game Started. Welcome to in the Soccer game!");
    }

    @Override
    void end() {
        System.out.println("Game Finished!");
    }
}// End of the Soccer class.
```

Step 4: Create a TemplatePatternDemo class.

```java
//This is a class.  
public class TemplatePatternDemo {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

        Class c = Class.forName(args[0]);
        Game game = (Game) c.newInstance();
        game.play();
    }
}// End of the Soccer class.
```