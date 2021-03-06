## Synchronized method

Thread Safe Singleton: A thread safe singleton in created so that singleton property is maintained even in multithreaded environment. To make a singleton class thread-safe, getInstance() method is made synchronized so that multiple threads can’t access it simultaneously.

```java
// Java program to create Thread Safe
// Singleton class
public class GFG
{
  // private instance, so that it can be
  // accessed by only by getInstance() method
  private static GFG instance;
 
  private GFG()
  {
    // private constructor
  }
 
 //synchronized method to control simultaneous access
  synchronized public static GFG getInstance()
  {
    if (instance == null)
    {
      // if instance is null, initialize
      instance = new GFG();
    }
    return instance;
  }
}
```

1) Lazy initialization is possible.
2) It is also thread safe.
3) getInstance() method is synchronized so it causes slow performance as multiple threads can’t access it simultaneously.