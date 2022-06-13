## Composite Design Pattern

> A Composite Pattern says that just "allow clients to operate in generic manner on objects that may or may not
> represent a hierarchy of objects".

Composite pattern is a partitioning design pattern and describes a group of objects that is treated the same way as a
single instance of the same type of object. The intent of a composite is to “compose” objects into tree structures to
represent part-whole hierarchies. It allows you to have a tree structure and ask each node in the tree structure to
perform a task.

- As described by Gof, “Compose objects into tree structure to represent part-whole hierarchies. Composite lets client
  treat individual objects and compositions of objects uniformly”.
- When dealing with Tree-structured data, programmers often have to discriminate between a leaf-node and a branch. This
  makes code more complex, and therefore, error prone. The solution is an interface that allows treating complex and
  primitive objects uniformly.
- In object-oriented programming, a composite is an object designed as a composition of one-or-more similar objects, all
  exhibiting similar functionality. This is known as a “has-a” relationship between objects.

### Advantage of Composite Design Pattern

- It defines class hierarchies that contain primitive and complex objects
- It makes easier to you to add new kinds of components.
- It provides flexibility of structure with manageable class or interface.

### Usage of Composite Pattern

It is used:

- When you want to represent a full or partial hierarchy of objects.
- When the responsibilities are needed to be added dynamically to the individual objects without affecting other
  objects. Where the responsibility of object may vary from time to time.

![image](https://www.javatpoint.com/images/designpattern/compositeuml1.jpg)

Elements used in Composite Pattern:
Let's see the 4 elements of composte pattern.

1) **Component**
   Declares interface for objects in composition.
   Implements default behavior for the interface common to all classes as appropriate.
   Declares an interface for accessing and managing its child components.
2) **Leaf**
   Represents leaf objects in composition. A leaf has no children.
   Defines behavior for primitive objects in the composition.
3) **Composite**
   Defines behavior for components having children.
   Stores child component.
   Implements child related operations in the component interface.
4) **Client**
   Manipulates objects in the composition through the component interface.

### Example of Composite Pattern

We can easily understand the example of composite design pattern by the UML diagram given below:

![image](https://www.javatpoint.com/images/designpattern/compositeuml2.jpg)

1) **Step 1**: 
Create an Employee interface that will be treated as a component.
```java
// this is the Employee interface i.e. Component.  
public interface Employee {
    public int getId();
    public String getName();
    public double getSalary();
    public void print();
    public void add(Employee employee);
    public void remove(Employee employee);
    public Employee getChild(int i);
}// End of the Employee interface.
```  

1) **Step 2**
Create a BankManager class that will be treated as a Composite and implements Employee interface.

File: BankManager.java
```java
// this is the BankManager class i.e. Composite.  
import java.util.ArrayList;  
import java.util.Iterator;  
import java.util.List;  
public class BankManager implements Employee {  
private int id;  
private String name;  
private double salary;

     public BankManager(int id,String name,double salary) {  
      this.id=id;      
      this.name = name;  
      this.salary = salary;  
     }  
         List<Employee> employees = new ArrayList<Employee>();  
     @Override  
     public void add(Employee employee) {  
        employees.add(employee);  
     }  
        @Override  
     public Employee getChild(int i) {  
      return employees.get(i);  
     }  
     @Override  
     public void remove(Employee employee) {  
      employees.remove(employee);  
     }    
     @Override  
     public int getId()  {  
      return id;  
     }  
     @Override  
     public String getName() {  
      return name;  
     }  
    @Override  
     public double getSalary() {  
      return salary;  
     }  
     @Override  
     public void print() {  
      System.out.println("==========================");  
      System.out.println("Id ="+getId());  
      System.out.println("Name ="+getName());  
      System.out.println("Salary ="+getSalary());  
      System.out.println("==========================");  
        
      Iterator<Employee> it = employees.iterator();  
        
          while(it.hasNext())  {  
            Employee employee = it.next();  
            employee.print();  
         }  
     }  
}// End of the BankManager class.
```