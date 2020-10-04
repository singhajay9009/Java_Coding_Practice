public class StringToInt
{
	public static void main(String[] args) {
	    int s = 10;
	    
	    String s1 = String.valueOf(s);
	    
	    String s2 = new StringBuilder().append(s).toString();
	    
	    String s3 = ""+s;
	    
	    System.out.println(s3 instanceof String);
	    
	    
	}
}