package section08;

public class Method08 {
   public static void main(String[] args) {
	   int[] values = {1, 2, 3, 4, 5, 98};
	   
	  double[] result = summary(values);
	  
	  System.out.println("힙계:" + result[0]);
	  System.out.println("평균:" + result[1]);
}
   public static double[] summary(int...values ) {
   double[] result = new double[2];
   
   int sum = 0;
   for(int value : values) {
	   sum += value;
   }
   
   double avg = sum / values.length;
   
  
   }
}
