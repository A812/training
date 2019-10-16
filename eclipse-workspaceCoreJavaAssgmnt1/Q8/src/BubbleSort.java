class BubbleSort {
	void bubbleSort(int arr[]) {
		int number = arr.length;
		for (int i = 0; i < number - 1; i++)
			for (int j = 0; j < number - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	void display(int arr[]) {
		int number = arr.length;
		for (int i = 0; i < number; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String args[]) {
		BubbleSort bs = new BubbleSort();
		int arr[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		bs.bubbleSort(arr);
		System.out.println("Sorted array ");
		bs.display(arr);
	}
}