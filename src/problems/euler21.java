package problems;

public class euler21 {

	
	public static void main(String[] args) {
		long s = System.currentTimeMillis();
		int x = 0;
	
		for(int a = 1; a < 10000; a++) {
			if( a == ds(ds(a)) && a != ds(a) ) {
				x+= a;
			}
		}
		System.out.println(x);
		long f = System.currentTimeMillis();
		System.out.println(f-s+"ms");
	}
	
	public static int ds(int a) {
		int z = 0;
		for(int i = 1; i < a; i++) {
			if(a % i == 0) {
				z += i;
			}
		}
		return z;
	}

}
