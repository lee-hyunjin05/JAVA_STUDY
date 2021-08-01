package och03;

public class Sw02 {

	public static void main(String[] args) {
	  	  int score = Integer.parseInt(args[0]);
    	  String grade = "";
     	  switch (score/10) {
	    	  case 10 :
	       	  case 9 :  grade = "A"; break;
	       	  case 8 :  grade = "B"; break;
	       	  case 7 :  grade = "C"; break;
	       	  case 6 :  grade = "D"; break;
	      	  default:  grade = "F";
   	      } 
    	  System.out.println("점수는"+score+" 이고 학점은 "+ grade);	}

}
