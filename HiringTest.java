// Please refer to this link for question : https://www.codechef.com/START3C/problems/HIRETEST


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HiringTest {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner s = new Scanner(System.in);

    // Number of test cases
		int T = s.nextInt();
		while (T > 0) {
			int N = s.nextInt();  // Number  of candidate
			int M = s.nextInt();  // Number  or problms
			int x = s.nextInt();  // Number of problem which is completly solved
			int y = s.nextInt();  // Number of problem which is partially sorted
			StringBuilder stringBuilder =new StringBuilder();
			for (int i = 0; i < N; i++) {
        // it will contain the count of problem which is solved completly or partially solved and not solved
        // Instead of  this we can maintain two count varaible also
				Map<Character, Integer> result = new HashMap<>();
				String cs = s.next();

        // Iterate through all the problem and count the occurance and put in map
				for (int k = 0; k < cs.length(); k++) {
					char c = cs.charAt(k);
					if (result.containsKey(c)) {
						result.put(c, result.get(c) + 1);
					} else {
						result.put(c, 1);
					}

				}

				int value1 = result.get('F') != null ? result.get('F') : 0;
				int value2 = result.get('P') != null ? result.get('P') : 0;

				if ((value1 >= x) || ((value1 == (x - 1)) && value2 == y))
					stringBuilder.append("1");
				else
					stringBuilder.append("0");

			}
			System.out.println(stringBuilder);
			T--;
		}
	}
}
