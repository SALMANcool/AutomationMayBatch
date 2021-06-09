package stringConcepts;

public class StringConcepts {

	String s1="Salman";//literal keyword
	String s2="salman";
	String s3=new String("salman");//new keyword
	String s4="praveen";
	
	public void m1()
	{
		System.out.println("3rd position of s1  "  +s1.charAt(2));
		System.out.println("length of s1   "  +s1.length());
		System.out.println("substring of s4"  +s4.substring(2,4));
		
		String s5="I am learning java   ";
		System.out.println("contains of characters present  "  +s5.contains("am learning"));
		String s6="String is";
		String s7="immutable";
		System.out.println("Concatanetion of s6 and s7  " +s6.concat(s7));
		String s8="";
		System.out.println("checking s7 object as empty  " + s7.isEmpty());//false
		System.out.println("checking s8 object as empty  " + s8.isEmpty());;//true
	
		System.out.println("replace method of s5" +s5.replace('a', 'e'));
		System.out.println("trim method removes spaces"  +s5.trim());
		
		String s10="I am learning java";
		System.out.println("converting uppercase s10" +s10.toUpperCase());
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringConcepts sc=new StringConcepts();
		sc.m1();
	}

}
