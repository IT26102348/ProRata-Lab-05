import java.util.Scanner;
public class IT26102348Lab5Q3{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		
		//constant
		final double ROOM_CHARGE = 48000.00;
		final double DISCOUNT_3_TO_4_DAYS=0.1;
		final double DISCOUNT_5_MORE_DAYS=0.2;
		
		int startDate, endDate, dateReserved ;
		
		double totalAmount,finalAmount,discountAmount;
		
		double discountRate;
		
		System.out.print("enter the start date(1-31): ");
		startDate = input.nextInt();
		
		System.out.print("enter the end date (1-31):" );
		endDate = input.nextInt();
		
		 //validation check
		if(startDate<1 || startDate>32 || endDate<1 || endDate>31){
			System.out.println("Error must be between 1 and 31");
			return;
		}
		if(startDate>=endDate){
			System.out.println("Error: days must be less than end date ");
			return;
		}
		
		dateReserved=endDate-startDate;
		
		if(dateReserved>=3 && dateReserved<=4){
			discountRate=0;
		}else if(dateReserved>=5){
			discountRate=DISCOUNT_3_TO_4_DAYS;
		}else{
			discountRate=DISCOUNT_5_MORE_DAYS;
		}
		
		totalAmount=ROOM_CHARGE*dateReserved;
		discountAmount=totalAmount * discountRate;
		finalAmount=totalAmount-discountAmount;
		
		System.out.println();
		System.out.println("Room charge per day: "+ROOM_CHARGE);
		System.out.println("number of days reseRved: "+dateReserved);
		System.out.println("Total amount to be paid: "+finalAmount);
	}
}	