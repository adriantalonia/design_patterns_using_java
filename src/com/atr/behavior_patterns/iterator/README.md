## Iterator Pattern

According to GoF, Iterator Pattern is used
> "to access the elements of an aggregate object sequentially without exposing its underlying implementation".

The Iterator pattern is also known as **Cursor**.

In collection framework, we are now using Iterator that is preferred over Enumeration.

### Advantage of Iterator Pattern

- It supports variations in the traversal of a collection.
- It simplifies the interface to the collection.

### Usage of Iterator Pattern:

#### It is used:

- When you want to access a collection of objects without exposing its internal representation.
- When there are multiple traversals of objects need to be supported in the collection.
  ![image](https://www.javatpoint.com/images/designpattern/iteratoruml.jpg)


1) Create a Iterartor interface.

```java
public interface Iterator {
    public boolean hasNext();

    public Object next();
}  
```

2) Create a Container interface.

```java
public interface Container {
    public Iterator getIterator();
}
```

3) Create a CollectionofNames class that will implement Container interface.

```java
public class CollectionofNames implements Container {
    public String name[] = {"Ashwani Rajput", "Soono Jaiswal", "Rishi Kumar", "Rahul Mehta", "Hemant Mishra"};

    @Override
    public Iterator getIterator() {
        return new CollectionofNamesIterate();
    }

    private class CollectionofNamesIterate implements Iterator {
        int i;

        @Override
        public boolean hasNext() {
            if (i < name.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return name[i++];
            }
            return null;
        }
    }
}  
}  
```

4) Create a IteratorPatternDemo class.

```java
public class IteratorPatternDemo {
    public static void main(String[] args) {
        CollectionofNames cmpnyRepository = new CollectionofNames();

        for (Iterator iter = cmpnyRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
} 
```

5) Output

> Name : Ashwani Rajput  
> Name : Soono Jaiswal  
> Name : Rishi Kumar  
> Name : Rahul Mehta  
> Name : Hemant Mishra  