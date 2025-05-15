package StringBufferBuilder;

public class Car {
	public static void main(String args [])
	{
    String str = "Welcome"; 
		StringBuilder sb = new StringBuilder(str);    
		sb.setCharAt(5, 'G');
		sb.insert(1, "SB"); 
		sb.delete(1,5);
		sb.append("World");
		System.out.println(sb);		
	}
}

	
	


