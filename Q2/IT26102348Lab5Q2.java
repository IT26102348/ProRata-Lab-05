import java.util.Scanner;
public class IT26102348Lab5Q2{
	public static void main(String[]args){
		int n1;
		Scanner input = new Scanner(System.in);
		System.out.print("enter the number that of new members introdused: ");
		n1=input.nextInt();
		
		
		switch(n1){
			case 0:
			System.out.println("no prize");
			break;
			
			case 1:
			System.out.println("prize is a : pen");
			break;
			
			case 2:
			System.out.println("prize is a : umbrella");
			break;
			
			case 3:
			System.out.println("prize is a : bag");
			break;
			
			case 4:
			System.out.println("prize is a : Travelling Chair");
			break;
			
			case 5:
			System.out.println("prize is a : Headphon");
			break;
			
			default:
			if(n1>= 5){
			  System.out.println("prize is a : heandphone");			   
			}else{
				System.out.println("input must be a number 0 or greater");
			}
			
		}
		
		
		
	}
}