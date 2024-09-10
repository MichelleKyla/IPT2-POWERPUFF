import java.util.Scanner;
public class Addition{ 

    public static void main(String args[]){  
     
     Scanner scan = new Scanner(System.in);

     System.out.print("Enter the first Number: ");
     double num1 = scan.nextDouble();

     System.out.print("Enter the second Number: ");
     double num2 = scan.nextDouble();

     double result = num1 + num2;

     System.out.println("Result: "+ result);
    
    scan.close();


      
    }  
}  

