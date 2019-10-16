import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sub1, sub2, sub3;
		
		System.out.println("Enter sub1, sub2, sub3 marks");
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		sub3=sc.nextInt();
		
		if(sub1>=60 && sub2>=60 && sub3>=60)
		{
			System.out.println("Passed");
		}
		else if(sub1>60 || sub2>60 || sub3>=60){
			System.out.println("Passed");
		}
		
		else if(sub1<60 || sub2<60 || sub3<60)
			System.out.println("Failed");
	
	}
	
}
