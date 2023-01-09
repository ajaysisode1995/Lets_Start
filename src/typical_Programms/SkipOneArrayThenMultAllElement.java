package typical_Programms;

public class SkipOneArrayThenMultAllElement {
	 public static void main(String[] args) {
	        int arr[]={2,4,1,5};
	       
	        
	        for(int i=0;i<arr.length;i++){
	        	
	         int multiplication=1;
	         
	         for(int j=0;j<arr.length;j++){
	        	 
	        if(arr[i]!=arr[j]){
	         multiplication=multiplication*arr[j];
	        }
	        
	        }
	        System.out.print(multiplication+" ");
	        
	        }
	        
	    }
}
