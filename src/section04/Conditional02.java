package section04;
/*
 * 1-2 if ~ else
 *  if(조건식){
 *    조건식 true일 때 실행되는 코드영역
 *    } else{
 *    조건식 false일때 실행되는 코드영역
 *    }
 *    
 *    마찬가지로 하나의 명령문일 때 중괄호 생략가능!
 *    
 *     if(조건식)
 *     조건식 true일때 실행 명령문;
 *     else
 *     조건식 false일때 실행명령문;
 * 
 * 
 * */
public class Conditional02 {
  public static void main(String[] args) {
	int num = 13;
	
	if(num % 2 == 0) {
		System.out.println("num은 짝수입니다.");
	}else {
		System.out.println("num은 홀수 입니다.");
	}
	if(num % 2 == 0)
		System.out.println("num은 짝수입니다.");
	else
	System.out.println("num은 홀수입니다.");
}
}
