package ch12_API;
import java.util.regex.*;
public class RegularEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = {
				"bat", "baby", "bpnus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date", "disc"
		};
		Pattern p = Pattern.compile("c[a-z]*");
		
		for(int i=0; i<data.length; i++) {
			Matcher m =p.matcher(data[i]);
			if(m.matches())
				System.out.println(data[i]+",");
		}
	}

}
