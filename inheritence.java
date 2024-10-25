//Inheritance = it is a feature that allow us to inherit or access full data from parent class to child class.

import java.util.Scanner;

class calculator_implementaion{
    int num1,num2;
    int operator;
     
    public void calculator(){
    
        if(operator == 1){
            System.out.println("The result is : " + (num1+num2));
        }
        else if(operator == 2){
            System.out.println(" The result is : " + (num1-num2));
        }
        else if(operator == 3){
            System.out.println("The result is : " + (num1 * num2));
        }
        else if(operator == 4){
            System.out.println("The result is : " + (num1/num2));
        }
        else{
            System.out.println("The result is : " + "Error");
        }
    }
}
class calculator_functionality extends calculator_implementaion{

    public void Display(){
        
        try (Scanner object = new Scanner(System.in)){   
        System.out.println("-----------------CREATE CALCULATION---------------");
        System.out.println("\n"); 
        System.out.println("1). '+'       2). '-' " );
        System.out.println("3). '*'       4). '/'  ");
        System.out.println("\n");

        System.out.print("Enter a operator : ");
        operator = object.nextInt();
        
        System.out.print("Enter the first Number :");
        num1 = object.nextInt();

        System.out.print("Enter the second Number :");
        num2 = object.nextInt();
        }
        catch (Exception e) {
            
        }
        
    }
}
public class inheritence {

    public static void main(String[] args) {
        calculator_functionality obj = new calculator_functionality();
        obj.Display();
        obj.calculator();
    }
}
