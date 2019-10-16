import java.util.Scanner;

public class Income {
	
	public static void main(String[] args) {
		
	
	
	Scanner sc = new Scanner(System.in);
	double ctc;
	double tax=0;
	
	System.out.println("Enter salary");
	ctc = sc.nextDouble();
	
	if(ctc>0 && ctc<=180000)
	{
		tax= (10*ctc)/100;
	}
	else if(ctc>181001 && ctc<=300000)
	{
		tax= (20*ctc)/100;
	}
	else if(ctc>300001 && ctc<=500000)
	{
		tax= (30*ctc)/100;
	}
	System.out.println("tax is " +tax);
	
	}	
}
