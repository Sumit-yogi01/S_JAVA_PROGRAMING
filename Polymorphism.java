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
        Display object = new Display();
        object.name = "Sumeet";
        object.age = 21;

        object.details(object.name,object.age);
        object.details(object.age);
    }
}

