package och03;

public class While1 {

	public static void main(String[] args) {
		int sum = 0, i = 1;
		
		while ( i <= 10) {
			//  i   = 1 , 2 , 3 ....
			//  sum = 1 , 3 , 6 .....
			sum += i;  // sum = sum + i
			System.out.println(i+"까지 합" + sum);
			i ++;
		}
		System.out.println("함계:" + sum);
		
	}

}
