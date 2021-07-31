package och02;

public class Operator3 {

	public static void main(String[] args) {
		   int x1  = 3; 
		   int x2  = 5;

		   // AND
		   System.out.printf("%b && %b = %b\n", false,false, false && false);
		   System.out.printf("%b && %b = %b\n", false,true,  false && true);
		   System.out.printf("%b && %b = %b\n", true,false,  true  && false);
		   System.out.printf("%b && %b = %b\n", true,true ,  true  && true);
		   // OR
		   System.out.printf("%b || %b = %b\n", false,false, false || false);
		   System.out.printf("%b || %b = %b\n", false,true,  false || true);
		   System.out.printf("%b || %b = %b\n", true,false,  true  || false);
		   System.out.printf("%b || %b = %b\n", true,true ,  true  || true);
		   // Not
		   System.out.printf("!%b  = %b\n", true ,  !true);
		   System.out.printf("!%b  = %b\n", false,  !false);
		   
		   if(x1 == 1 && x2 ==5 ) {
			   System.out.println(" x1 == 1 && x2 == 5 ");
		   }
		   else if(x1 == 1 && x2 !=5 )  System.out.println(" x1 == 1 && x2 != 5 ");
		   else if(x1 != 1 && x2 ==5 )  System.out.println(" x1 != 1 && x2 == 5 ");
		   else                    	    System.out.println(" x1 != 1 && x2 != 5 ");
	}

}
