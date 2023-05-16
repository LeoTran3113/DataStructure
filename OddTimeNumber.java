package cm4structure;

public class OddTimeNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 1, 3, 5, 7, 3, };
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result = result ^ arr[i];
		}

		System.out.println("Number appear odd time is :" + result);
	}

}
