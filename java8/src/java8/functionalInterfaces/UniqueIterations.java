package java8.functionalInterfaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniqueIterations {

	public static void main(String[] args) {
		String messi = "https://www.facebook.com";
		Pattern p = Pattern.compile("{https http}");
		Matcher m = p.matcher(messi);
		while (m.find()) {
		    System.out.println(m.start() );
		}
	}
}
