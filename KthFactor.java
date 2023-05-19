package cm4structure;

import java.util.ArrayList;
import java.util.List;

public class KthFactor {
	public static void main(String[] args) {
		int n = 12;
		int k = 3;
		
		int factors = getKFactor(n,k);
		System.out.println("Factor " + k + " of " + n + " is " + getKFactor(n,k));
		//System.out.println("Factor at k is: " + kFactor.get(k));

	}

	public static int getKFactor(int n, int k) {
		List<Integer> factor = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				factor.add(i);

			}
		}
		System.out.println("List of factor is: " + factor.toString());
		
		return factor.size() < k ? -1 : factor.get(k - 1);
	}
}
	