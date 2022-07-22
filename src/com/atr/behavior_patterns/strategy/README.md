## Strategy Pattern

A Strategy Pattern says that "defines a family of functionality, encapsulate each one, and make them interchangeable".

The Strategy Pattern is also known as Policy.

### Benefits:

- It provides a substitute to subclassing.
- It defines each behavior within its own class, eliminating the need for conditional statements.
- It makes it easier to extend and incorporate new behavior without changing the application.

![image](https://www.javatpoint.com/images/designpattern/strategy-pattern3.png)

### Implementation of Strategy Pattern:

Step 1:
Create a Strategy interface.

```java
//This is an interface.
public interface Strategy {

    public float calculation(float a, float b);

}// End of the Strategy interface.
```

Step 2:
Create a Addition class that will implement Startegy interface.

```java
//This is a class.  
public class Addition implements Strategy {

    @Override
    public float calculation(float a, float b) {
        return a + b;
    }

}// End of the Addition class.
```

Step 3:
Create a Subtraction class that will implement Startegy interface.

```java
//This is a class.  
public class Subtraction implements Strategy {

    @Override
    public float calculation(float a, float b) {
        return a - b;
    }

}// End of the Subtraction class.
```

Step 4:
Create a Multiplication class that will implement Startegy interface.

```java
//This is a class.
public class Multiplication implements Strategy {

    @Override
    public float calculation(float a, float b) {
        return a * b;
    }
}// End of the Multiplication class.
```

Step 5:
Create a Context class that will ask from Startegy interface to execute the type of strategy.

```java
//This is a class.
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public float executeStrategy(float num1, float num2) {
        return strategy.calculation(num1, num2);
    }
}// End of the Context class.
```

Step 6:
Create a StartegyPatternDemo class.

```java
//This is a class.  

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrategyPatternDemo {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first value: ");
        float value1 = Float.parseFloat(br.readLine());
        System.out.print("Enter the second value: ");
        float value2 = Float.parseFloat(br.readLine());
        Context context = new Context(new Addition());
        System.out.println("Addition = " + context.executeStrategy(value1, value2));

        context = new Context(new Subtraction());
        System.out.println("Subtraction = " + context.executeStrategy(value1, value2));

        context = new Context(new Multiplication());
        System.out.println("Multiplication = " + context.executeStrategy(value1, value2));
    }

}// End of the StrategyPatternDemo class.
```