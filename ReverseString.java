
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str="hellow guru balaji how are you";
		//reverseStr(Str);
		split(Str);

	}

	public static void reverseStr(String str)
	{
		
		int i=0;
		
		for( i=str.length()-1;i>=0;i--)
		{
			char s1=str.charAt(i);
			System.out.print(s1);
		}
	}
	public static void split(String str)
	{
		String[]  s1=str.split(" ");
		
		//System.out.println(s1[1]);
	for(int i=0;i>=s1.length;i++)
		{
			System.out.println(s1[i]);
		} 
	}
}
