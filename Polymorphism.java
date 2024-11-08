// Polymorphism == Polymorphism allows us to perform a single action in different ways.
// Polymorphism have two types 
// 1). Compile Time (overloading).
// 2). Runtime      (overriding) .  

//Polymorphism...............................................
//overloading = overloading allows us to define multiple methods in same class with same name but different parameters

class Display{

    String name;
    int age;

    public void details(String name){
        System.out.println(name);
    }
    public void details(int age){
        System.out.println(age);
    }
    public void details(String name, int age){
        System.out.println(name + " and " + age);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Display objectofDisplay = new Display();
        objectofDisplay.name = "Sumeet";
        objectofDisplay.age = 21;

        objectofDisplay.details(objectofDisplay.name,objectofDisplay.age);
        objectofDisplay.details(objectofDisplay.age);
    }
}

