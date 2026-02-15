# Java Programming

## Java programming topics covered:

### 1.Variables (Instance, Static, Local, Final)

```
Instance Variables: Variables declared inside a class but outside any method. Each object of the class has its own copy of instance variables.
Static Variables: Variables declared with the static keyword. They belong to the class rather than any specific instance, and there is only one copy shared among all instances.
Local Variables: Variables declared inside a method. They are only accessible within that method and do not retain their values between method calls.
Final Variables: Variables declared with the final keyword. Once assigned a value, they cannot be changed (constants).
```

### 2.Data Types and Type Casting (Primitive and Non-Primitive)

```
Primitive Data Types: Include byte, short, int, long, float, double, char, and boolean. They store simple values and have a fixed size.
Non-Primitive Data Types: Include classes, interfaces, and arrays. They can store complex data and have methods associated with them.
Type Casting: The process of converting a variable from one data type to another. It can be implicit (automatic) or explicit (manual).
```

### 3.Operators (Arithmetic, Relational, Logical, Bitwise, Assignment, Ternary)

```
Arithmetic Operators: Used for mathematical operations like addition (+), subtraction (-), multiplication (*), division (/), and modulus (%).
Relational Operators: Used to compare two values, such as equal to (==), not equal to (!=), greater than (>), less than (<), greater than or equal to (>=), and less than or equal to (<=).
Logical Operators: Used to combine multiple boolean expressions, including AND (&&), OR (||), and NOT (!).
Bitwise Operators: Operate on individual bits of integer types, such as AND (&), OR (|), XOR (^), NOT (~), left shift (<<), right shift (>>), and unsigned right shift (>>>).
Assignment Operators: Used to assign values to variables, including simple assignment (=) and compound assignments (+=, -=, *=, /=, %=).
Ternary Operator: A shorthand for an if-else statement, represented as (condition ? valueIfTrue : valueIfFalse).
```

### 4.Loops (For, While, Do-While, Enhanced For)

```
For Loop: Used to iterate a block of code a specific number of times.
Syntax: for(initialization; condition; increment/decrement) { // code to be executed }
While Loop: Repeats a block of code as long as a specified condition is true.
Syntax: while(condition) { // code to be executed }
Do-While Loop: Similar to the while loop, but guarantees that the code block is executed at least once before checking the condition.
Syntax: do { // code to be executed } while(condition);
Enhanced For Loop: A simplified version of the for loop, used to iterate over arrays or collections.
Syntax: for(dataType element : collection/array) { // code to be executed }
```

### 5.Conditional Statements (if, if-else, switch)

```
If Statement: Executes a block of code if a specified condition is true.
Syntax: if(condition) { // code to be executed }
If-Else Statement: Provides an alternative block of code to execute if the condition is false.
Syntax: if(condition) { // code to be executed } else { // alternative code }
Switch Statement: Allows a variable to be tested for equality against a list of values (cases).
Syntax: switch(variable) { case value1: // code to be executed; break; case value2: // code to be executed; break; default: // code to be executed; }
```

### 6.Strings (String Class, StringBuffer, StringBuilder)

```
String Class: Immutable sequence of characters. Once created, the value cannot be changed. Common methods include length(), charAt(), substring(), and equals().
StringBuffer: Mutable sequence of characters. It can be modified after creation and is synchronized (thread-safe). Common methods include append(), insert(), and reverse().
StringBuilder: Similar to StringBuffer but not synchronized, making it faster for single-threaded applications. Common methods include append(), insert(), and reverse().
```

### 7.Classes and Objects

```
Classes: Blueprints for creating objects. They define properties (variables) and behaviors (methods) of the objects.
Objects: Instances of classes that encapsulate data and behavior. Each object has its own state and can interact with other objects.
```

### 8.Methods and Modifiers (Static, Final, Abstract, Synchronized)

```
Methods: Blocks of code that perform a specific task. They can take parameters and return values.
Static Methods: Belong to the class rather than any instance. Can be called without creating an object of the class.
Final Methods: Cannot be overridden by subclasses. Used to prevent modification of the method's behavior.
Abstract Methods: Declared without an implementation in abstract classes. Subclasses must provide an implementation.
Synchronized Methods: Used in multi-threaded environments to ensure that only one thread can access the method at a time, preventing data inconsistency.
```

### 9.Blocks (Static, Instance, Local)

```
Static Blocks: Executed when the class is loaded. Used for static initialization of variables.
Instance Blocks: Executed when an instance of the class is created. Used for instance initialization.
Local Blocks: Code blocks defined within methods. They can be used to limit the scope of variables
```

### 10.Constructors (Default, Parameterized, Private, Static)

```
Default Constructor: A no-argument constructor provided by the compiler if no constructors are defined in the class. Initializes instance variables to default values.
Parameterized Constructor: A constructor that accepts parameters to initialize instance variables with specific values when an object is created.
Private Constructor: A constructor declared as private, preventing instantiation of the class from outside. Often used in singleton patterns.
Static Constructor: Java does not have static constructors like some other languages. However, static blocks can be used for static initialization.
```

### 11.Keywords (Super, This, Static, Final, Default)

```
Super: Refers to the parent class and is used to access parent class methods and constructors.
This: Refers to the current instance of the class and is used to access instance variables and methods.
Static: Used to declare static variables and methods that belong to the class rather than any instance
Final: Used to declare constants, prevent method overriding, and prevent inheritance of classes.
Default: Used in switch statements to specify the default case when no other cases match.
```

### 12.Arrays (Single Dimensional, Multi-Dimensional)

```
Single Dimensional Arrays: A linear collection of elements of the same type, accessed using a single index.
Syntax: dataType[] arrayName = new dataType[size];
Multi-Dimensional Arrays: An array of arrays, allowing for the creation of matrices or tables.
Syntax: dataType[][] arrayName = new dataType[rows][columns];
```

### 13.Encapsulation (Getters and Setters)

```
Encapsulation: The practice of restricting direct access to an object's data and providing controlled access through methods.
Getters: Methods that return the value of a private variable. They allow read access to the variable.
Setters: Methods that set the value of a private variable. They allow controlled write access to the variable, often including validation.
```

### 14.Inheritance (Method Overriding, Method Overloading)

```
Inheritance: A mechanism where a new class (subclass) inherits properties and behaviors (methods) from an existing class (superclass).
Method Overriding: A subclass provides a specific implementation of a method that is already defined in its superclass. It allows for runtime polymorphism.
Method Overloading: A class can have multiple methods with the same name but different parameter lists (different types or number of parameters). It allows for compile-time polymorphism.
```

### 15.Polymorphism (Compile-Time, Run-Time)

```
Polymorphism: The ability of a single function or method to operate in different ways based on the context.
Compile-Time Polymorphism: Achieved through method overloading and operator overloading.
Run-Time Polymorphism: Achieved through method overriding, where the method to be invoked is determined at runtime based on the object's actual type.
```

### 16.Abstractions (Abstract Classes, Abstract Methods)

```
Abstraction: The concept of hiding complex implementation details and showing only the essential features of an object.
Abstract Classes: Classes that cannot be instantiated and may contain abstract methods (methods without implementation) as well as concrete methods (methods with implementation).
Abstract Methods: Methods declared without an implementation in an abstract class. Subclasses must provide an implementation for these methods.
```

### 17.Interfaces (Default Methods, Static Methods)

```
Interfaces: Abstract types that define a contract for classes to implement. They can contain abstract methods, default methods, and static methods.
Default Methods: Methods in an interface with a default implementation. They allow adding new methods to interfaces without breaking existing implementations.
Static Methods: Methods in an interface that belong to the interface itself and can be called without an instance of the implementing class.
```

### 18.Exception Handling (Try, Catch, Finally, Throw, Throws)

```
Try: A block of code that is monitored for exceptions. If an exception occurs, control is transferred to the catch block.
Catch: A block of code that handles the exception thrown in the try block. It can specify the type of exception to catch.
Finally: A block of code that is always executed after the try and catch blocks, regardless of whether an exception occurred or not. It is typically used for cleanup activities.
Throw: Used to explicitly throw an exception from a method or block of code.
Throws: Used in method declarations to indicate that a method can throw one or more exceptions, allowing the caller to handle them.
```

### 19.File Handling (IO Streams, Readers, Writers)

```
IO Streams: Used for reading from and writing to data sources such as files, network connections, and memory. They can be classified into byte streams (InputStream, OutputStream) and character streams (Reader, Writer).
Readers: Character-based input streams used to read text data from a source. Common classes include FileReader and BufferedReader.
Writers: Character-based output streams used to write text data to a destination. Common classes include FileWriter and BufferedWriter.
```

### 20.Collections Framework (List, Set, Map)
```
Collections Framework: A unified architecture for representing and manipulating collections of objects. It includes interfaces, implementations, and algorithms.
List: An ordered collection (also known as a sequence) that allows duplicate elements. Common implementations include ArrayList and LinkedList.
Set: A collection that does not allow duplicate elements. Common implementations include HashSet and TreeSet.
Map: An object that maps keys to values, allowing for key-value pairs. Common implementations include HashMap and TreeMap.
```

### 21.Enums (Enum Class, Enum Methods)

```
Enum Class: A special Java class used to define a fixed set of constants. Enums are type-safe and can have fields, methods, and constructors.
Enum Methods: Common methods include values(), which returns an array of all enum constants, and valueOf(String name), which returns the enum constant with the specified name.
```

### 22.Lambda Expressions (Functional Interfaces, Stream API)

```
Lambda Expressions: A concise way to represent a functional interface (an interface with a single abstract method) using an expression. They enable functional programming in Java.
Functional Interfaces: Interfaces that contain exactly one abstract method. Examples include Runnable, Callable, and custom interfaces annotated with @FunctionalInterface.
Stream API: A powerful API for processing sequences of elements (collections) in a functional style. It supports operations like filter, map, reduce, and collect.
```

### 23.Program Practice (Strings, Numbers, Collections, Arrays)

```
Practice: Implementing various programs to reinforce understanding of Java fundamentals, including string manipulation, numerical computations, collection handling, and array operations.
```
