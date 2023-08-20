package section09;

public class TV {
      double size;
      String resolution;
      int year;
      String brand;
      
      public TV() {
    	  this.size = 80;
    	  this.resolution = "UHD(4K)";
    	  this.year = 2023;
    	  this.brand = "삼성";
      }
      
      //생성자 오버로딩
      public TV(double size, String resolution, int year, String brand ) {
    	  this.size = size;
    	  this.resolution = resolution;
    	  this.year= year;
    	  this.brand = brand;
      }
      public void getInfo() {
    	  System.out.println();
      }
}
