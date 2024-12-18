package test.mypac;

public class IosPhone extends HandPhone {
	
	public IosPhone() {
			System.out.println("IosPhone 생성자 호출됨");
	}
	public void payMobile() {
		System.out.println("카드없이 결제를 해요");
	}
		
	@Override
	public void call() {
		System.out.println("영상통화를 걸어요!");
	}
	
}
