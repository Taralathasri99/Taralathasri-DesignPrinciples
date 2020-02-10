package Design_Principles.task2;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App extends Calculator
{
    public static void main( String[] args )
    {
        int choice;
        int num1,num2;
        Calculator c=new Calculator();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
        	System.out.println("Enter your the operation you want to perform\n 1.Addition 2.Subtraction 3.Division 4.Multiplication 5.Exit\n");
        	choice=sc.nextInt();
        	System.out.println("For division Second operator must not equal to Zero");
        	System.out.println("Enter the two Numbers");
        	num1=sc.nextInt();
        	num2=sc.nextInt();
        	int[] arr= {c.Add(num1, num2),c.Sub(num1, num2),c.Divide(num1, num2),c.Multiply(num1, num2)}; 
        	if(choice==5)
        		break;
        	else
        		System.out.println(arr[choice-1]);
     
        }
        
    }
}
