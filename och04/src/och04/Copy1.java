package och04;

public class Copy1 {

	public static void main(String[] args) {
		int[] a  = {1,2,3,4,5,6,7};
		int[] b = new int [10]; 
		
		pr(a);
//		for(int i=0 ; i < a.length; i++) {
//			b[i] = a[i];
//		}
		//              a배열 0위치부터    b배열 0위치에    a 배열 길이만큼 복사 
		System.arraycopy(a,   0,        b, 0,        a.length);
		System.out.println("---------print b---------");
		pr(b);
		cls(b);
		System.out.println("---------print b 2 ---------");
		System.arraycopy(a, 0, b, 2, a.length);
		pr(b);
		cls(b);
		System.out.println("---------print a 1 ---------");
		System.arraycopy(a, 1, b, 0, a.length-1);
		pr(b);
		cls(b);
		System.out.println("---------print a 1 b 3---------");
		System.arraycopy(a, 1, b, 3, a.length-1);
		pr(b);
		cls(b);		

	}
	
	public static void cls(int[] arr) {
		for(int i=0; i < arr.length ; i++) {
			arr[i]  = 0;
		}
		
	}
	
	public static void pr(int[] b) {
		for(int i=0; i < b.length ; i++) {
			System.out.print(b[i] +"\t");
		}
        System.out.println();		
	}

}
