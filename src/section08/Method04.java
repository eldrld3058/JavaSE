package section08;
/*
 * 
 * 오버로딩 (overloading)
 * 클래스 내에서 같은 이름을 가진 메서드를 여러개 정의하는 것을 말한다.
 * 매개변수 개수 또는 타입이 다르면 가능하다.
 * 
 * 
 * */
public class Method04 {
  public static void main(String[] args) {
	printPokemon("025","피카츄");
	printPokemon("025","피카츄","전기");
}
  public static void printPokemon(String no, String name) {
	  System.out.println("No."+ no);
	  System.out.println("Name."+ name);
  }
  //4.오버로딩(overloading)
  public static void printPokemon(String no, String name,String type) {
	  System.out.println("No."+ no);
	  System.out.println("Name."+ name);
	  System.out.println("Type."+ type);
  }
}  
