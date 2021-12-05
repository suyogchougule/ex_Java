package Basic;
import java.util.*;

public class ArithmaticOperationbychoice {
	public static void main(String[] args)
	{
		int num1,num2,choice;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First number.");
		num1=sc.nextInt();
		System.out.println("Enter Second number.");
		num2=sc.nextInt();
		
		System.out.println("Enter your choice.");
		System.out.println("1.Addition"+"\n"+"2.Subtraction"+"\n"+"3.Multiplication");
		
		choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.println("1.Addition of First and Second  number."+ (num1+num2));
				break;
			case 2:
				System.out.println("2.Subtraction of first and second number."+ (num1-num2));
				break;
			case 3:
				System.out.println("3.Multiplication of first and second number is ="+ (num1*num2));
				break;
			default:
				System.out.println("Wrong choice");
		}
		
		
		
		
		
	}

}
