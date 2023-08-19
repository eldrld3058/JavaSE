package section05;

public class LoopHomeWork3 {
   public static void main(String[] args) {
	    for(int k=0; k < 3; k++) {
	    	System.out.println("k: "+ k);
	    
	    for( int i =0;i< 9;i++) {
	    	for(int j=0;j<3;j++) {
	    		int dan = j+2 + (k*3);
	    		int mul = i+1;
	    		int result = dan * mul;
	    		if(dan < 10)
	    		System.out.printf("%d x %d =%d\t",dan,mul,result);
	    	}
	    	System.out.println();
	    }
	    System.out.println();
}
   }
}
