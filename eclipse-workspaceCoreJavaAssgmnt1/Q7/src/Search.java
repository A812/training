import java.util.Arrays;
import java.util.Scanner;

public class Search {

	
		
		public static void check(Integer[] arr, int searchNum) 
		{

			
			boolean check = Arrays.asList(arr).contains(searchNum);

			
			
			System.out.println(+searchNum + " present in the array ? - > " + check);
		}

		public static void main(String[] args) 
		{

			Integer arr[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };

			int searchNum = 19;

			System.out.println("Given Array : " + Arrays.toString(arr));

			check(arr, searchNum);
		}
}
