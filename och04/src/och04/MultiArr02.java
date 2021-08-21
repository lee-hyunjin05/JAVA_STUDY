package och04;

public class MultiArr02 {

	public static void main(String[] args) {
        //                 0행             1행               2행
        int[][] a = { { 12, 45, 23 }, { 16, 4, 879 }, { 45, 87, 12 } };
        //                    행의 크기
        for (int i = 0; i < a.length; i++) {
        	//                  각 행의 열 Size  
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("================= 확장 =================");
		for (int [] i : a) {
			for (int j  : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}


	}

}
