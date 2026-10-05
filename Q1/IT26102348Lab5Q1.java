import java.util.Scanner;
public class IT26102348Lab5Q1{
	public static void main(String[]args){
		int n1,n2,n3;
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		n1=input.nextInt();
		
		System.out.print("enter the second integer: ");
		n2=input.nextInt();
		
		System.out.print("enter the second integer: ");
		n3=input.nextInt();
		
		System.out.println();
		
		System.out.println("user entered number are: "+n1+" "+n2+" "+n3);
		
		if(n1<n2 && n1<n3){
				System.out.println("the samllest value is:" +n1);
	
		}else if(n2<n3){
				System.out.println("the samllest value is: "+n2);
			
		}else{
				System.out.println("the samllest value is: " +n3);
		}
		
		
		if(n1>n2 && n1>n3){
			System.out.println("the largest value is:"+n1);
			
		}else if(n2>n3){
				System.out.println("the largest value is: "+n2);
				
		}else{
				System.out.println("the largest value is:"+n3);
	
		}
		}
	}
