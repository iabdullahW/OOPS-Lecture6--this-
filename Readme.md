# StudentInfo-Usage of "This" KEYWORD

This project demonstrates a simple Java class representing a `Student` entity. The `Student` class includes attributes for roll number, name, and fee, along with methods to initialize and display these details.

## Project Structure

- **Student Class**: Contains attributes `rollNo`, `name`, and `fee`. It also includes a constructor for initialization and a `display` method to output student information.
- **Main Class**: Instantiates a `Student` object and invokes the `display` method.

## Code Overview

### Student.java
```java
class Student {
    int rollNo;
    String name;
    float fee;
    
    Student(int rollNo, String name, float fee) {
        this.rollNo = rollNo;
        this.name = name;
        this.fee = fee;
    }
    
    void display() {
        System.out.println(rollNo + " " + name + " " + fee);
    }
}
