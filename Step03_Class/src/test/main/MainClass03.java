package test.main;

import test.mypac.Car;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 *   Car 객체를 3개 만들어서
		 *   임의의 자동차 이름과 가격을 필드에 각각 대입하는 코드를 작성해 보세요.
		 */
		
		Car car1=new Car();
		Car car2=new Car();
		Car car3=new Car();
		
		car1.name="벤츠";
		car1.price=5000;
		car2.name="포르쉐";
		car2.price=10000;
		car3.name="부가티";
		car3.price=200000;
		
		/*
		 *   다 하신 분은 자신만의 클래스를 test.mypac 패키지에 만들어 놓고 테스트 하는 코드를 작성해 보세요.
		 */
	}
}