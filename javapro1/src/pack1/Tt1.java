package pack1;

public class Tt1 {

	public static void main(String[] args) {
		// AA
//		  ABBA
//		 ABCCBA
//		ABCDDCBA
//	   ABCDEEDCBA
//	   ABCDEEDCBA
//	    ABCDDCBA
//	     ABCCBA
//	      ABBA
//	       AA

		for (int i = 1; i < 6; i++) {

			for (int a = 5; a > i; a--) {
				System.out.print(" ");

			}
			for (int b = 1; b <= i; b++) {
				System.out.print("b");

			}
			for (int d = 1; d <= i; d++)
				System.out.print("d");

			System.out.println();
		}

		for (int j = 6; j > 1; j--) {
			for(int z = 6; z>j; z--) {
				System.out.print(" ");
				
			}
			for(int k = j ; k > 1; k--)
				System.out.print("2");
			
			for(int k = j; k > 1; k--)
				System.out.print("*");
			
			System.out.println();
			}

		
		}
	}

