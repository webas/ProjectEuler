package problems;

import java.util.ArrayList;
import java.util.List;

public class euler29 {

	
	public static void main(String[] args) { 
		List M = new ArrayList();
		
		for(int a = 2; a <= 100; a++) {
			for(int b = 2; b <= 100; b++) {
				if(!M.contains(Math.pow(a, b))) {
					M.add( Math.pow(a,b));
				}
			}
		}	
		System.out.println(M.size());
	}

}
