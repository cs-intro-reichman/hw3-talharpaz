// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		
		if ( x2 == 0 ) return x1;
		if ( x2 > 0){
		 for ( int i = 1; i<= x2; i++){
			x1++;
		}
	    } else {
			for ( int i = 0; i> x2; i--){
				x1--;
			}

		}
	    
		return x1;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		if ( x2 == 0 ) return x1;
		if (x1 == 0 && x2==0){
			for ( int i = 0; i > x2; i--){
				x1++;
			}
		}
		if (x2 < 0) {
			for ( int i = 0; i> x2; i--){
				x1++;
		}
	    } else{
		for ( int i = 1; i<= x2; i++){
			x1--;
		}
	}
		return x1;
}
	

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		
		if ( x1 == 0 || x2 == 0) {
			return 0;
		}
		if (x1 < 0 && x2 < 0) {
			int posX1 = minus(minus(x1, x1), x1);
			int posX2 = minus(minus(x2, x2), x2);
			times(posX1, posX2);
		}
		if (x2 < 0) {
			int multi = x2;
		for ( int i = 1; i< x1; i++){
			multi = plus(multi , x2);
		}
			
		}
		if (x1 < 0) {
			int multi = x1;
		for ( int i = 1; i< x2; i++){
			multi = minus(multi , x1);
		}
			
		}
		int multi = x1;
		for ( int i = 1; i< x2; i++){
			multi = plus(multi , x1);
		}
		return multi;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int pow = x;
		if ( n == 0 && x==0){
			return -1;
		}
		if ( n == 1){
			return pow;
		}
		if ( n == 0){
			return 1;
		}
		if ( x == 0){
			return 0;
		}
		for ( int i = 1; i< n; i++){
			pow = times(pow , x);
		}
		return pow;
	
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		int div = x1;
		int count =0;
		if ( x1 == 0) return 0;
		if ( x2 == 0) return -1;

		while (div != 0) {
			
			if ((x1 > 0 && x2 <0)|| (x1 < 0 && x2 >0)) {
				div = plus(div, x2);
				count ++;
			}
			if (x1 < 0 && x2 <0) {
				div = minus(div, x2);
				count ++;
			}
			if (x1 < 0 && x2 <0) {
				div = minus(div, x2);
				count ++;
			}else{
			 div= minus(div, x2);
			 count++;
			}
		}
		return count;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		int mod = x1;
		while (mod >= x2) {
			 mod= minus(mod, x2);
			 
		}
		return  mod;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		int i = 2;
		while (i < x ) {
			if (mod(x, i) == 0 && pow(i, 2) == x ) {
				
					break;
					
				}
				i++;
			}
			return  (int)i;
	   
		
	}	  	  
}
