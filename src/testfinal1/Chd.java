package testfinal1;

public class Chd extends Prt{
	
	//final 필드 나중에 값 변경불가
	public int time=2;
	
	@Override
	public void rest() {
		time=5;
		System.out.println(time+"asdf");
	}
}
