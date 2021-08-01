package och03;

public class Continue01 {

	public static void main(String[] args) {
	  	 for (int i = 0; i < 10 ; i ++) {
    		 System.out.println("대박 i = " + i );
    	 	 if ( i > 5) continue;
    		 System.out.println("쪽박 i= " + i);
    	 }
	}

}
