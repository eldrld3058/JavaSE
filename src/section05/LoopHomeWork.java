package section05;

public class LoopHomeWork {
  public static void main(String[] args) {
        System.out.println("   ☆");
	    for(int i=0; i<7; i++) {
	    	
	    	for(int j=0; j<7; j++) {
	    		if(i <= 7/2) {
	    			if(j < 3 - i) {
	    				System.out.print(" ");
	    			}else if(j > 3 + i){
		    			System.out.print(" ");
		    		}else {
			    		System.out.print("*");
			    	}
	    		}
	    		}
	    	 System.out.println();
	    }
	    System.out.println("merry christmas!!");
	    
	   
}
}
