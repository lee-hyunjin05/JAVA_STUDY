package och09;

class Point3D{
	int x, y, z;
	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//equals는 주소를 가지고 하지만, 문자열을 비교하도록 오버라이딩해서 바꿔줄 수 있다.
	// 조상의 것을 찾는게 아니라 point3D의 것으로 맞추기 위함					
	public boolean equals(Point3D pd) {
		boolean result = false;
		//		true			true			true
		if(this.x==pd.x && this.y==pd.y && this.z == pd.z) {
			result = true;
		}//객체의 번지를 같게 해준것
		return result;
	}//오버라이딩 안해주면 주소값 같다고 나와서 값이 다르다고 나옴.
	// 태초에 오브젝트에 관련된 거 오버라이딩 해준
	//내가 정의 해 준거
	//오버라이딩 아니고 고쳐준거 본래거에서

	@Override
	public String toString() { //해시코드값으로 나오는 걸 오버라이딩해서 객체값을 반환하도록 한거
		// TODO Auto-generated method stub
	//return super.toString();
		
		return "[x = " +x+ ", y= "+y+", z = "+z+" ]";
		
	}

}


public class Ex01 {

	public static void main(String[] args) { //ctrl+t : 객체 속성
		
		Point3D pd1 = new Point3D(1, 2, 3);
		Point3D pd2 = new Point3D(1, 2, 3);
		Point3D pd3 = new Point3D(1, 2, 5);
		
		if(pd1.equals(pd2)) {
			System.out.println("같다.");
		}
		else {
			System.out.println("다르다.");
		}
		if(pd1.equals(pd3)) {
			System.out.println("같다.");
		}
		else {
			System.out.println("다르다.");
		}
		
		System.out.println(pd1);
		System.out.println(pd3);
	}

}
