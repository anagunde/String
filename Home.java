
/*
 * In Java, String, StringBuilder, and StringBuffer are used to work with text date.
Unlike String, both StringBuilder and StringBuffer are mutable, meaning you can modify the contents without creating new objects.
 */

package StringBufferBuilder;

public class Home {
	public static void main(String[] args) {

		String s = "good";
		String s1 = s.concat("morning");   
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s1 == s);

		StringBuffer sb = new StringBuffer("good");
		StringBuffer p = sb.append("morning");          
												
		System.out.println(sb.hashCode());
		System.out.println(p.hashCode());
		System.out.println(sb);
		System.out.println(p);
		System.out.println(sb == p);

	}

}






