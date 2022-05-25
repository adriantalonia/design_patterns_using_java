## Double-Checked Locking

n this mechanism, we overcome the overhead problem of synchronized code. In this method, getInstance is not synchronized but the block which creates instance is synchronized so that minimum number of threads have to wait and that’s only for first time.

```java
// Java code to explain double check locking
public class GFG
{
  // private instance, so that it can be
  // accessed by only by getInstance() method
  private static GFG instance;
 
  private GFG()
  {
    // private constructor
  }
 
  public static GFG getInstance()
  {
    if (instance == null)
    {
      //synchronized block to remove overhead
      synchronized (GFG.class)
      {
        if(instance==null)
        {
          // if instance is null, initialize
          instance = new GFG();
        }
       
      }
    }
    return instance;
  }
}
```