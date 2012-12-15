package problems;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class euler4 {

	
	public static void main(String[] args) {
		long s = System.currentTimeMillis();
		List v = new ArrayList();
		for(int a = 100; a < 1000; a++) {
			for(int b = 100; b < 1000; b++) {
				int prod = a * b;
				String n = Integer.toString(prod);
				StringBuilder w = new StringBuilder(n);
				int difference = Integer.parseInt(n) - Integer.parseInt(w.reverse().toString());
				if(difference == 0) {
					if(!v.contains(prod)) {
						v.add(prod);
					}
				}
			}
		}
		
		System.out.println(Collections.max(v));
		long f = System.currentTimeMillis();
		System.out.println("\n" + (f - s) + "ms");
	}

}
