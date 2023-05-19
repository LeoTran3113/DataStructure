package cm4structure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Sock {
	public static void main(String[] args) {

		List<Integer> socks = new ArrayList<>();

		socks.add(1);
		socks.add(2);
		socks.add(1);
		socks.add(2);
		socks.add(1);
		socks.add(3);
		socks.add(2);

		int n = socks.size();
		
		System.out.println("List of socks: " + socks);
		System.out.println("Total Pair of socks: "+ totalPair(n,socks));
	}

	public static int totalPair(int n, List<Integer> socks) {

		int totalPair = 0;

		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < n; i++) {

			if (!hs.contains(socks.get(i))) {
				hs.add(socks.get(i));
			} else {
				hs.remove(socks.get(i));
				totalPair++;
			}
		}
		return totalPair;
	}

}
