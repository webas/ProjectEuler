package problems;

public class euler36 {

	
	public static void main(String[] args) {
		long s = System.currentTimeMillis();
		int q = 0;
		for(int i = 1; i < 1000000; i++) {
		
				String j = Integer.toBinaryString(i);
				
				StringBuilder _sb = new StringBuilder(Integer.toString(i)).reverse();
				StringBuilder sb = new StringBuilder(j).reverse();
				Boolean base10eq = Integer.toString(i).equals(_sb.toString());
				Boolean base2eq = j.equals(sb.toString());
				
			
				if(base10eq && base2eq) {
					q += i;
				}
			
	
		}
		
		System.out.println(q);
		long f = System.currentTimeMillis();
		System.out.println("\n" + (f - s) + "ms");
	}

}
