package problems;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class euler22 {

	
	public static void main(String[] args) throws IOException {
		
		List m = new ArrayList();
		String names = new String();
		
		Path path = Paths.get("c:/users/steve/desktop/dev/java/euler/src/problems/names.txt");
	    try (Scanner scanner =  new Scanner(path)){
	      names = scanner.nextLine();      
	    }
	    
	    for(String x : names.split(",")) {
	    	m.add(x.replaceAll("\"", ""));
	    }
	    
	    int j = 0;
	    Collections.sort(m);
	
	    
	    for(int i = 0 ; i < m.size(); i++) {
	    	String n = m.get(i).toString();
	    	int p = 0;
	    	for(int k = 0; k < n.length(); k++) {
	    		p += n.charAt(k) - 64;
	    	}
	    	j += (i + 1) * p;
	    }
	    
	   System.out.println(j);
	}

}
