package section09;

public class Book {
  String title;
  int price;
  int totalPage;
  String author;
  
  public Book() {
	  
  }
  
  public void getInfo() {
	 System.out.println("title:"+title);
	 System.out.println("price:"+price);
	 System.out.println("totalPage:"+totalPage);
	 System.out.println("author:"+author);
  }
}
