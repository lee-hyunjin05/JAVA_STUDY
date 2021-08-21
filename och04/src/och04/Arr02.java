package och04;

public class Arr02 {

	public static void main(String[] args) {
		int[] a = new int[] {23,45,67,789,2};
		for(int i = 0; i < a.length ; i++) {
			System.out.println("a[" +i+"] = " + a[i]);
		}
		System.out.println("=============확장형============");
                   // 23,45,67,789,2
		for(int k : a) {
    		System.out.println("k= " + k);
    	}
	}

}
