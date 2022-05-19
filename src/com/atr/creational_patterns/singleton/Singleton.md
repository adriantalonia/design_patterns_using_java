## Singleton Design Pattern

> The singleton pattern is one of the simplest design patterns. Sometimes we need to have only one instance of our class for example a single DB connection shared by multiple objects as creating a separate DB connection for every object may be costly. Similarly, there can be a single configuration manager or error manager in an application that handles all problems instead of creating multiple managers.

### Definition:
> The singleton pattern is a design pattern that restricts the instantiation of a class to one object.
 
### Advantages/Disadvantages 

- Controlled access to sole instance
- Reduced name space
- Permits a variable number of instances
- Singletons hinder unit testing

```java
// Classical Java implementation of singleton
// design pattern
class Singleton
{
    private static Singleton obj;
 
    // private constructor to force use of
    // getInstance() to create Singleton object
    private Singleton() {}
 
    public static Singleton getInstance()
    {
        if (obj==null)
            obj = new Singleton();
        return obj;
    }
}
```

#### When to use DI(dependency injection) over the singleton pattern

- when you want your software to be under unit tests
- avoid using statics
- you have a non-stable dependency

#### When to use a singleton over DI
- Ambient dependencies are dependencies which span across multiple classes and often multiple layers
- an example it's logger service

#### Implementation
- private constructor to restrict instantiation of the class from other classes
```java
private Singleton() {}
``` 
- private static variable of the same class that is the only instance of the class
```java
private static Singleton obj;
```
- public static method that returns the instance of the class
```java
public static Singleton getInstance() {
    if (obj==null)
        obj = new Singleton();
    return obj;
}
```
![image](https://static.packt-cdn.com/products/9781786463593/graphics/96d762be-a2b2-4f2b-ab2b-d71e98233431.png)


### 5 Approaches

1) Lazy evaluation approach
   - it's not multi-thread safe
   - not recommended
2) Synchronized approach 
   - thread safe
   - multi-threaded 
3) Double