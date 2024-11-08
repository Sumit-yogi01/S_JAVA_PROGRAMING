// abstract = abstraction is a process of hiding implementation details and showing only funtionality details
abstract class Aadhar{
    int UDHI_number = 244687679;
    String User_name = "Sumit Yogi";
    String Password = "Sumit@7976";
   abstract void display();      
}

class User extends Aadhar{
   public void display(){
       System.out.println("User name is : " + User_name);
       System.out.println("User Aadhar number is : " + UDHI_number);
   }
}

public class Abstract {
   public static void main(String[] args) {

      User objectofUser = new User();
      objectofUser.display();



   }
}

