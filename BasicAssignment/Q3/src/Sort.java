
public class Sort {

	public static void main(String[] args) {
		int n = args.length;
		int array[];
		array = new int[n];
		
		for (int m = 0; m < n; m++) {
			array[m] = Integer.parseInt(args[m]);
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[i] > array[j]) {
					int a = array[i];
					array[i] = array[j];
					array[j] = a;

				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Sorted numbers are " + array[i]);
		}
	}

}
