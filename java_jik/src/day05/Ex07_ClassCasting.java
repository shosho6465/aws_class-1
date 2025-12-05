package day05;

import day05.Shape.Rect;

public class Ex07_ClassCasting {

	public static void main(String[] args) {
		/* 클래스 형변환
		 * -조상 클래스와 자손 클래스 관계일 때 클래스 형변환이 가능
		 * -업캐스팅
		 *  -자동으로 변환이 가능
		 *  -자식 클래스의 객체를 부모 클래스로 변환하는 경우
		 * -다운캐스팅
		 *  -강제로 변환
		 *  -부모 클래스의 객체를 자식 클래스로 변환하는 경우
		 *  -조건부로 가능
		 */
		//업캐스팅(자식 객체 => 부모 객체가 사용)
		Rect r = new Rect(0, 0, 10, 10);
	    r.draw();
	    Shape.p = r;
	    p.draw();
	    
	    //다운캐스팅(부모 객체 => 자식 객체 사용)
	    //1. 문제가 되는 상황
	    Shape p1 = new Shape("도형")
	    p1.draw();
	    //Rect r1 = (Rect)p1; //다운캐스팅이 정상적으로 일어나지 않아 예외 발생
	    //r1.draw();
	    
	    //2. 정상적으로 돌아가는 상황
	    Rect r2 = new Rect(5, 5, 10, 10)
	    Shape p2 = r2;
	    Rect r3 = (Rect)p2;
	    p2.draw();

	    
	   /* 다형성
	    * 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
	    * 
	    */
	  
	}

}
