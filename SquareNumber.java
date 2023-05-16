package cm4structure;

import java.util.ArrayList;
import java.util.List;

public class SquareNumber {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		arrayList.add(7);
		arrayList.add(8);
		arrayList.add(9);
		System.out.println("Array: " + arrayList);

		List<Integer> num = checkSquareNumber(arrayList);
		for (Integer i : num) {
			System.out.println("Square number is : " + i);
		}
	}

	public static List<Integer> checkSquareNumber(List<Integer> num) {
		ArrayList<Integer> squareNum = new ArrayList<Integer>();
		for (Integer i : num) {

			double square = Math.sqrt(i);

			if (square - Math.floor(square) == 0) {
				squareNum.add(i);

			}

		}
		return squareNum;
	}
}
