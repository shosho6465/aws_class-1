package day05;

public class Ex06_inheritance {

	public static void main(String[] args) {
		/*클래스 상속
		 * -클래스를 물려 받는 것
		 * -부모 클래스의 필드, 메서드를 물려 받는 것
		 * 왜 사용?
		 * -상속을 통해 코드의 중복을 제거
		 * -다형성을 통해 여러 객체를 관리할 수 있다
		 *-상속은 is a 관계
		 * -A는 B이다가 성립하면 A: 자식 클래스, B는 부모클래스
		 * -스마트폰은 폰이다(o)
		 * -스마트폰은 : 자식, 폰 : 부모
		 * -스마트폰은 카메라이다(x)
		 *  -상속이 불가능
		 * -포함은 has a 관계
		 *  -클래스의 필드로 다른 클래스의 객체가 오는 경우
		 *  -A는 B를 가지고 있다가 성립하면 A클래스의 필드로 B를 선언
		 *-상속하는 방법
		 * -부모 클래스가 선언되어 있음
		 * -extends 키워드 이용
		 *class 자식클래스명 extends 부모클래스명{
		 *   //추가할 필드  
		 *
		 *  //추가할 메서드
		 *  
		 *  //생성자 추가
		 *  
		 *  }
		 * -상속을 받으면 부모 클래스의 모든 필드와 메서드를 사용할 수 있다? X
		 *  => private 된 필드/메서드는 사용할 수 없다.
		 *  
		 * -super 객체
		 *  -부모를 가리키는 객체
		 *  -super.메서드명(): 부모 클래스의 메서드를 호풀.
		 * -super 생성자
		 *  -부모 클래스의 생성자를 호출
		 *  -생성자 첫 번째에 있어야 함
		 * -매서드 오버라이딩
		 *  -부모클래스의 메서드를 재정의하는 것
		 *  -부모 클래스의 메서드와 리턴타입, 메서드명, 매개변수가 동일해야 함
		 *  -접근제어자 범위가 같거나 넓어져야 함
		 * -부모 클래스는 2개이상 올 수 없다
		 * => 여러 클래스에게 한 번에 상속 받을 수 없다.
		 * 
		 */
		Rect r = new Rect(0, 0, 10, 10);
		r.draw

	}

}
//도형 클래스
class Shape{
 String name;
 public void draw() {
	 System.out.println(name + "을 그립니다.");
 }
 public Shape() {}
 public Shape(String name) {
	 this.name = name;
 }
 class Rect extends Shape{
	 int left;
	 int top;
	 int right;
	 int bottom;
	 public Rect(int left, int top, int right, int bottom) {
		 name = "사각형";
		this.left = left;
		this.top = top;
		this.right = right;
		this.bottom = bottom;
	 }
	 
	 
 }
 
}

































