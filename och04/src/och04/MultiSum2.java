package och04;

public class MultiSum2 {

	public static void main(String[] args) {
		int sum = 0;
		//                   강승석      강윤주        곽동호 
		int[][] score = {{78,87,56}, {98,89,67} ,{70,80,90}};
		String[] title = {"국어","영어","수학","합계","평균"};
		String line = "===========================================";
		
		for(String str: title) {
			System.out.print(str+"\t");
		}
		System.out.println("\n"+line);
		//        행
		for(int [] sc :score) {
			// 열
			for(int s : sc) {
				System.out.print(s+"\t");   // 국어	영어	수학
				sum += s;   // 한 사람당 합계   sum = sum + s
			}
			// System.out.println();
			System.out.println(sum+"\t"+sum/sc.length);  // 합계	평균
			sum = 0;
		}
		
		
		
		
		
		
		
		
		
		
	}

}
