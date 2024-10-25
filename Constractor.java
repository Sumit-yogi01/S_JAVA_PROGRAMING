//constractor = it is a special method that is used to initialize objects.
//..The constructor is called when an object of a class is created.

class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;

        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class Constractor {
    public static void main(String[] args) {
        
        Student objStudent = new Student("Lakshmi", 18);

    }
}
