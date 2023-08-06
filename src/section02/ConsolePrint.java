package section02;
/*
 * 출력문
 * 데이터를 화면에 출력하는 방법
 * System.out.println() : 괄호안 내용 출력 후 행 바꿈
 * System.out.print() : 괄호안 내용 출력 행 바꿈 (X)
 * System.out.printf() : 문자열 서식문자를 이용해 
 *                       형식화된 내용 출력 행 바꿈 (X)
 *                       
 *                       
 *  서식문자
 *    %d : 정수(10진수)               
 *    %o : 정수 (8진수)               
 *    %x : 정수(16진수)
 *    %f : 실수
 *    %e :
 *    %s :
 *    %c :             
 *                       
                      
 *  깃허브 수정중입니다
 */

public class ConsolePrint {
	public static void main(String[] args) {
		System.out.print("Welcome. ");
		System.out.println("JAVA World");
		
		System.out.printf("오늘은 %d월 %d일 입니다. \n", 8, 5);
		
		System.out.printf("%d은 첫번째, %f은 두번째, %s은 세번째",1,2.0,"셋");
	}
}
