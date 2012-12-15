package problems;

import java.util.ArrayList;
import java.util.List;

public class euler28 {

	
	public static void main(String[] args) {
		int m = 2;
		int total = 0;
		int spiral = 1001;
		for(int i = 3, z = 1; i <= Math.pow(spiral,  2); i+=m,z++) {
			
			total += i;
			
			if(z % 4 == 0) {
				m += 2;
			}
		}
		System.out.println(total + 1);
	}
	
}
