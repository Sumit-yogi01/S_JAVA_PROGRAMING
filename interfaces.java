// Interface is a way to achive 100% abstraction.We can't create object of an interface.
// This is mainly use for multipal inheritance.

interface Phone {
    int Number = 2776; // this will always fix
    public void Display();
}
interface Mobile{
    int callog = 23432;
}
class Vivo implements Phone , Mobile{
    public void Display(){
        System.out.println(callog);
    }
}
public class interfaces {
    public static void main(String[] args) {
        Vivo objofVivo = new Vivo();
        objofVivo.Display();

        // we can aslo declare obj like this ....
        // Phone Vivo  = new Vivo();
        // Vivo.Display();
    }
}
