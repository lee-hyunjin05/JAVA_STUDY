package och08;

public interface Volume {
	void volumeUp();
	void volumeDown();
}

class TV implements Volume{
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("TV Volume 올리기");
	}

	@Override
	public void volumeDown() {
		System.out.println("TV Volume 내리기");
	}

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("TV 화면을 본다");
	}

	
}

class Audio implements Volume {
	
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("Audio Volume 올리기");
	}
	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("Audio Volume 내리기");
	}
	
}

class Speaker implements Volume {
	
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("Speaker Volume 올리기");
	}
	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("Speaker Volume 내리기");
	}
	
}


