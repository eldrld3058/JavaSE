package section01;
/*
 * 주석
 *  코드에 영향을 주지 않는 개발자가 사용하는 메모공간
 *  
 *  Ctrl + d : 줄삭제
 *  Ctrl + F11 : 실행
 *  
 *  
 *  alt ctrl : 아래 방향키 복사 
 * Alt shift j : javadoc 주석 단축키  
 */
public class Comment {
	public static void main(String[] args) {
		// 한줄 주석 
		System.out.println("Hello, jAVA!");
		
		getArea(10);
	}

	/*
	 * 원의 넓이 구하기
	 * 반지름  r 을 입력하여 원의 넓이를 출력한다.
	 * @param r - 반지름
	 * 
	 */


	public static void getArea(int r) {
		double area = Math.PI * Math.pow(r,2);
		System.out.println("원의 넓이: "+area);
	}
}









