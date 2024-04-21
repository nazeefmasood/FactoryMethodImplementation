 ## Factory Method Implementation

 **Note:** This project is developed in Eclipse.


In the given question, we were asked to implement the Factory Method pattern to extend the functionality of creating shapes. Let's break down the process:

### Point 2 - TriangleGeometry Class
We were tasked with creating a `TriangleGeometry` class to add support for creating triangle shapes. Here's how we achieved it:

- We created the `Triangle` class to represent a triangle shape.
- In the `Demo` class, we instantiated a `TriangleGeometry` object and called its `createShape()` method to create a triangle shape.
- The created triangle shape was then added to an `ArrayList` of shapes.
- Finally, we iterated over the list and called the `draw()` method for each shape to print its representation.

Here's the code snippet for the `Demo` class after adding support for the triangle shape:


```java
import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        
        CircleGeometry circleGeometry = new CircleGeometry();
        SquareGeometry squareGeometry = new SquareGeometry();
        TriangleGeometry triangleGeometry = new TriangleGeometry();
        
        shapes.add(circleGeometry.createShape());
        shapes.add(squareGeometry.createShape());
        shapes.add(triangleGeometry.createShape());
        
        for(Shape s : shapes){
            s.draw();
        }
    }
}

```

### 3. Factory Method Implementation

For point 3, we were tasked with implementing the Factory Method pattern to simplify the creation of shapes. Here's a breakdown:

The Factory Method pattern is a design pattern where we define a single method for creating objects, eliminating the need for separate factory classes for each product. This simplifies the code and promotes flexibility.

### Implementing the Factory Method

To implement the Factory Method pattern, we created a `ShapeFactory` class in Java. This class serves as a central factory for creating different types of shapes. Here's how we did it:

- **Definition of `ShapeFactory`**: We created a Java class named `ShapeFactory` to serve as our factory.
-  **`createShape()` Method**: Within the `ShapeFactory` class, we defined a static method called `createShape()`. This method takes a `type` parameter, representing the type of shape to create.
-  **Shape Creation Logic**: Inside the `createShape()` method, we used a switch statement to determine the type of shape requested. Based on the type provided, we instantiate and return the corresponding shape object (e.g., `Circle`, `Square`, or `Triangle`).
-  **Usage in `MainApplication`**: In the `MainApplication` class, we utilized the `ShapeFactory` to create shapes. We passed the name or type of the shape to the `createShape()` method of `ShapeFactory`, and it returned the desired shape object.
-  **Simplified Code**: With the Factory Method pattern, we no longer need separate classes like `Geometry`, `TriangleGeometry`, `CircleGeometry`, or `SquareGeometry` for creating shapes. The `ShapeFactory` handles all shape creation logic in a centralized manner.

Here's the implementation of the `ShapeFactory` and its usage in `MainApplication`:

```java
import java.util.ArrayList;

public class MainApplication {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        
        shapes.add(ShapeFactory.createShape("Circle"));
        shapes.add(ShapeFactory.createShape("Square"));
        shapes.add(ShapeFactory.createShape("Triangle"));
        
        for(Shape s : shapes){
            s.draw();
        }
    }
}
```
```java
public class ShapeFactory {
    public static Shape createShape(String type) {
        switch (type.toLowerCase()) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "triangle":
                return new Triangle();
            default:
                throw new IllegalArgumentException("Invalid shape type: " + type);
        }
    }
}

```
### 4.1 and 4.2  Conversion of C# Code to Java

For point 4.1, we were tasked with running the example. However, in point 4.2, we needed to convert the provided C# code to Java and understand its functionality. Let's break it down:

### Understanding the Code

In the given code, we have two factories: `PersonFactory` and `PhoneFactory`. Additionally, an extra concrete factory was added for better comprehension.

#### PersonFactory and Person Types

- The `PersonFactory` is responsible for creating instances of `IPerson`, where `IPerson` represents different types of people.
- We have two types of persons: `Villager` and `CityPerson`, representing people from rural and urban areas, respectively.
- These person types are created using the `PersonFactory` by passing the type of person (Rural or Urban) as an argument.
- The types of persons are defined in the `PersonType` enum class, which contains constants representing rural and urban types.

Here's the implementation of creating persons using `PersonFactory`:

```java
package examples;

public class Main {
    public static void main(String[] args) {

        PersonFactory personFactory = new PersonFactory();
        
        IPerson ruralPerson = personFactory.getPerson(PersonType.Rural);
        System.out.println("Rural person: " + ruralPerson.getName());
        
        IPerson urbanPerson = personFactory.getPerson(PersonType.Urban);
        System.out.println("Urban person: " + urbanPerson.getName());
    }
}
```

### Using Factory Method Pattern

In the code snippet provided, we demonstrate the use of the Factory Method pattern for creating objects of different types. Let's break it down:

#### Creating Persons with PersonFactory

- First, we create a `PersonFactory` object to generate instances of different types of persons.
- We pass the type of person (Rural or Urban) to the factory to generate the corresponding person object.
- After obtaining the person objects, we print their names using the `getName()` method.

#### Using AbstractFactory and ConcreteFactory for Products

- We have two additional factories: `PhoneFactory` and `TabletFactory`, implementing the Abstract Factory pattern.
- The `PhoneFactory` and `TabletFactory` classes serve as abstract factories for creating phone and tablet products, respectively.
- They both define an abstract method `makeProduct()`, which is implemented differently by their concrete factory classes.
- The concrete factory classes (`PhoneConcreteFactory` and `TabletConcreteFactory`) implement the `makeProduct()` method to create specific products.
- In the `Main` class, we create instances of concrete factory classes (`PhoneConcreteFactory` and `TabletConcreteFactory`) to obtain phone and tablet products.
- We use the `getObject()` method to obtain the product objects created by the factories.
- Finally, we print the details of the phone and tablet products, including their names, prices, and colors.

Here's the complete implementation:

```java
public class Main {
    public static void main(String[] args) {

        PersonFactory personFactory = new PersonFactory();
        IPerson ruralPerson = personFactory.getPerson(PersonType.Rural);
        System.out.println("Rural person: " + ruralPerson.getName());
        IPerson urbanPerson = personFactory.getPerson(PersonType.Urban);
        System.out.println("Urban person: " + urbanPerson.getName());

        ProductAbstractFactory phoneFactory = new PhoneConcreteFactory();
        ProductAbstractFactory tabletFactory = new TabletConcreteFactory();

        IProduct phone = phoneFactory.getObject();
        IProduct tablet = tabletFactory.getObject();

        System.out.println("Phone name: " + phone.getName());
        System.out.println("Phone price: $" + phone.getPrice());
        System.out.println("Phone Color: " + phone.getColor());

        System.out.println("Tablet name: " + tablet.getName());
        System.out.println("Tablet price: $" + tablet.getPrice());
        System.out.println("Tablet Color: " + tablet.getColor());
    }
}
```
