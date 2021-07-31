package och02;

public class VarEx02 {

	public static void main(String[] args) {
		float n1 = 33;
		float n2 = 10;
		double result;
		
		
		result = n1+n2;
		System.out.printf("%f %c %f = %.1f\n",  n1, '+', n2, result);
		result = n1 - n2;
		System.out.printf("%f %c %f = %.1f\n",  n1, '-', n2, result);
		result = n1 * n2;
		System.out.printf("%f %c %f = %.1f\n",  n1, '*', n2, result);
		result = n1 /  n2;
		System.out.printf("%f %c %f = %.2f\n",  n1, '/', n2, result);
		result = 10 %  3;

	}

}
