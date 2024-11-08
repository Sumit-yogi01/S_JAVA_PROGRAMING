// overriding = It is a feature that allow a sub class to provide a specific implementaion of a method ...
// .. that already define in his parent class.

class Parent{
    public void print(){
        System.out.println("This is parent class");
    }
}

class child extends Parent{
    public void print(){
        System.out.println("This is sub class");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Parent objofParent = new child();
        objofParent.print();
    }
}
