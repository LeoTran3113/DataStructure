package cm4structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Candles {
	public static void main(String[] args) {
		int result = 0;
		ArrayList<Integer> candles = new ArrayList<Integer>();
		candles.add(3);
		candles.add(4);
		candles.add(1);
		candles.add(3);
		candles.add(6);
		candles.add(8);
		candles.add(7);
		candles.add(3);
		System.out.println("Array: " + candles);
		System.out.println("Amount of highest candles is :" + birthdayCandles(candles));
	}

	public static int birthdayCandles(List<Integer> candles) {
		Collections.sort(candles);
		int size = candles.size();
		int highest = candles.get(size - 1);
		int count = 1;
		for (int i = size - 2; i >= 0; i--) {
			if (candles.get(i) != highest) {
				break;
			} else {
				count++;
			}
		}
		return count;

	}
}