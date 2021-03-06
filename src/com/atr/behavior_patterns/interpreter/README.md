## Interpreter Pattern

An Interpreter Pattern says that
> "to define a representation of grammar of a given language, along with an interpreter that uses this representation to
> interpret sentences in the language".

Basically the Interpreter pattern has limited area where it can be applied. We can discuss the Interpreter pattern only
in terms of formal grammars but in this area there are better solutions that is why it is not frequently used.

This pattern can applied for parsing the expressions defined in simple grammars and sometimes in simple rule engines.

### Advantage of Interpreter Pattern

- It is easier to change and extend the grammar.
- Implementing the grammar is straightforward.

![image](https://www.javatpoint.com/images/designpattern/interpreteruml.jpg)

1) Create a Pattern interface.

```java
public interface Pattern {
    public String conversion(String exp);
}
```  

2) Create a InfixToPostfixPattern class that will allow what kind of pattern you want to convert.

```java
import java.util.Stack;

public class InfixToPostfixPattern implements Pattern {
    @Override
    public String conversion(String exp) {
        int priority = 0;// for the priority of operators.  
        String postfix = "";
        Stack<Character> s1 = new Stack<Character>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
// check the precedence  
                if (s1.size() <= 0)
                    s1.push(ch);
            } else {
                Character chTop = (Character) s1.peek();
                if (chTop == '*' || chTop == '/')
                    priority = 1;
                else
                    priority = 0;
                if (priority == 1) {
                    if (ch == '*' || ch == '/' || ch == '%') {
                        postfix += s1.pop();
                        i--;
                    } else { // Same  
                        postfix += s1.pop();
                        i--;
                    }
                } else {
                    if (ch == '+' || ch == '-') {
                        postfix += s1.pop();
                        s1.push(ch);
                    } else
                        s1.push(ch);
                }
            }
        }  
else
        {
            postfix += ch;
        }
    }

    int len = s1.size();  
for(
    int j = 0;
    j<len;j++)

    {
        postfix += s1.pop();
    }
      
    return postfix;
}   
}
```  

3) Create a InterpreterPatternClient class that will use InfixToPostfix Conversion.

```java
public class InterpreterPatternClient {
    public static void main(String[] args) {
        String infix = "a+b*c";

        InfixToPostfixPattern ip = new InfixToPostfixPattern();

        String postfix = ip.conversion(infix);
        System.out.println("Infix:   " + infix);
        System.out.println("Postfix: " + postfix);
    }
}
```

Ooutput
> Infix:   a+b * c  
> Postfix: abc*+ }

### Another example

![image](https://media.geeksforgeeks.org/wp-content/uploads/UMLDiagram-1.png)

- **AbstractExpression** (Expression): Declares an interpret() operation that all nodes (terminal and nonterminal) in
  the AST overrides.
- **TerminalExpression** (NumberExpression): Implements the interpret() operation for terminal expressions.
- **NonterminalExpression** (AdditionExpression, SubtractionExpression, and MultiplicationExpression): Implements the
  interpret() operation for all nonterminal expressions.
- **Context** (String): Contains information that is global to the interpreter. It is this String expression with the
  Postfix notation that has to be interpreted and parsed.
- **Client** (ExpressionParser): Builds (or is provided) the AST assembled from TerminalExpression and
  NonTerminalExpression. The Client invokes the interpret() operation.

```java
// Expression interface used to
// check the interpreter.
interface Expression {
    boolean interpreter(String con);
}

// TerminalExpression class implementing
// the above interface. This interpreter
// just check if the data is same as the
// interpreter data.
class TerminalExpression implements Expression {
    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpreter(String con) {
        if (con.contains(data)) {
            return true;
        } else {
            return false;
        }
    }
}

// OrExpression class implementing
// the above interface. This interpreter
// just returns the or condition of the
// data is same as the interpreter data.
class OrExpression implements Expression {
    Expression expr1;
    Expression expr2;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public boolean interpreter(String con) {
        return expr1.interpreter(con) || expr2.interpreter(con);
    }
}

// AndExpression class implementing
// the above interface. This interpreter
// just returns the And condition of the
// data is same as the interpreter data.
class AndExpression implements Expression {
    Expression expr1;
    Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public boolean interpreter(String con) {
        return expr1.interpreter(con) && expr2.interpreter(con);
    }
}

// Driver class
class InterpreterPattern {

    public static void main(String[] args) {
        Expression person1 = new TerminalExpression("Kushagra");
        Expression person2 = new TerminalExpression("Lokesh");
        Expression isSingle = new OrExpression(person1, person2);

        Expression vikram = new TerminalExpression("Vikram");
        Expression committed = new TerminalExpression("Committed");
        Expression isCommitted = new AndExpression(vikram, committed);

        System.out.println(isSingle.interpreter("Kushagra"));
        System.out.println(isSingle.interpreter("Lokesh"));
        System.out.println(isSingle.interpreter("Achint"));

        System.out.println(isCommitted.interpreter("Committed, Vikram"));
        System.out.println(isCommitted.interpreter("Single, Vikram"));

    }
}
```
