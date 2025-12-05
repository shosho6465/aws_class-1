package day05;

public class Ex08_Polymorphism {

	public static void main(String[] args) {
		/* 다형성
		 * 하나의 코드가 여러 자료형으로 구현되어 실행되는 것 
		 * 
		 * 매개변수의 다형성
		 * 
		 * 객체의 다형성
		 */
		
		/* 왜 Shape을 상속 받을 수 있을까요?
		 * 이 파일엔 Shape 클래스가 없는데
		 * 같은 패키지에 다른 파일 안에 Shape 클래스가 선언되어 있고
		 * Shape 클래스의 접근제어자가 디폴트여서 같은 패키지인 이 파일에서 사용할 수 있음 
		 */
class Circle extends Shape{
			int cx, cy;
			int r; //반지름
			public Circle(int cx, int cy, int r) {
				super("원");
				this.cx = cx;
				this.cy = cy;
				this.r = r;
			}
			
			@override
			publlic void draw() {
				super.dra();
				System.out.println("중심점 : (" + cx "," + cy + );
			}
			
			//Alt + Shift + S: 생성자 생성 단축키
			
		}

	}

}
