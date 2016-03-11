package strings;

import java.util.HashSet;
import java.util.Iterator;

public class StringPerm {

	public static HashSet<String> perm = new HashSet<>(); 
	
	public static void permString(String s, int index) {
		StringBuffer sb = new StringBuffer(s);
		if(s.length()-1 == index) {
			System.out.println(s);
			perm.add(s);
			return;
		}
		
		for(int i = index; i < s.length(); i++) {
			String permStr = swap(sb,index,i);
			System.out.println(permStr);
			perm.add(permStr);
			permString(permStr, index+1);
		}
	}
	
	public static String swap(StringBuffer s, int i , int j) {
		char charI = s.charAt(i);
		char charJ = s.charAt(j);
		s.setCharAt(j, charI);
		s.setCharAt(i, charJ);
		return s.toString();
	}
	
	public static void main(String[] args) {
		permString("ABC", 0);
		
//		Iterator<String> iter = perm.iterator(); 
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
	}
}
