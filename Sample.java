import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] arr= {1,4,3,2,4,6,3,4,5,3,54};
		
		List<Integer> al=Arrays.asList(arr);
		
		Object [] obj=al.toArray();
		
		System.out.println(al);
		//System.out.println(obj);
		
		String str="gurubalaji hi how are you";
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		for(char c:str.toCharArray())
			//map.merge(c, 1, Integer::sum);
		System.out.println();
		
		
		

	}

}
