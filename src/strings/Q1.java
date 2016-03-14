package strings;

public class Q1 {

	public static boolean palindrom(String s, int i, int j) {
		if( i > j || i == j) {
			return true;
		}
		
		if(s.charAt(i) == s.charAt(j)) {
			return palindrom(s, i+1, j-1);
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String a = "helleh"; 
		String b = "h"; 
		String c = "matlam"; 
		String d = "hoh"; 

		System.out.println(palindrom(a,0,a.length()-1));
		System.out.println(palindrom(b,0,b.length()-1));
		System.out.println(palindrom(c,0,c.length()-1));
		System.out.println(palindrom(d,0,d.length()-1));

	}
}
