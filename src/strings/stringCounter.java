package strings;

public class stringCounter {


	public static String countChars(String input) {
	
	    String out = "";     
	    int currentCount = 0; 
	    int currentIndex = 0; 
	    
	    for(int i = 0; i < input.length(); i++) {
	        if(input.charAt(currentIndex) == input.charAt(i)) {
	            currentCount++;
	        } else {
	            out += Integer.toString(currentCount) + input.charAt(currentIndex); 
	            currentCount = 0; 
	            currentIndex = i; 
	            i--;
	        }
	    }
	   
	    out += Integer.toString(currentCount) + input.charAt(currentIndex);
	   return out; 
	   
	}
	
	public static void main(String[] args) {
		System.out.println(countChars("ccddaaa"));
	}
}
