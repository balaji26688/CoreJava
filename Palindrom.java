
public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Original="RADAR";
		String Reverse="";
		
		for(int i=Original.length()-1;i>=0;i--) 
			Reverse =Reverse+Original.charAt(i);
		
		if(Original.equalsIgnoreCase(Reverse))
		{
			System.out.println("given string is palindrom");
		}else
		{
			System.out.println("given string is not palindrom");
		}
	}

}
