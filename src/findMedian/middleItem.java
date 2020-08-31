package findMedian;
import java.util.Scanner;
public class middleItem {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	      int[] userValues = new int[9];  // Set of data specified by the user      

	      /* Type your code here. */
	  
	    int index = userValues.length;
	    
	    for(int i = 0 ; i <= userValues.length ;i++){
	       int input = scnr.nextInt(); 
	       if(input < 0){
	       index = i-1;
	      break;
	       }
	    if (i < userValues.length){
	    userValues[i] = input;   
	    }else{
	       System.out.println("Too many inputs");
	    break;
	    }
	    
	    }
	   
	    System.out.println(userValues[index/2]);
	  
	  	
	}

}
