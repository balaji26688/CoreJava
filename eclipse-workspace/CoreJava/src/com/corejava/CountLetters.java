package com.corejava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountLetters {
	
	public static void letterscount()
	{
		 String str = "amit";
	      int count = 0;
	      System.out.println("String: "+str);
	      for (int i = 0; i < str.length(); i++) {
	         if (Character.isLetter(str.charAt(i)))
	         count++;
	      }
	      System.out.println("Letters: "+count);
	}
	public static void letteerscountByMap()
	{
String str="Welcome to Infosys";
		
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();//order wise will give output like start from 'w'
		//Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();//order wise will give output like start from 'alphabetical'

		for(char c:str.toCharArray())
		{
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else
			{
				map.put(c, 1);
			}
		}
		
		for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }		
	}
	
	public static void countWords()
	{
		String str="hellow guru balaji how are you hellow guru how you";
		String [] strarr=str.split(" ");
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		for(String arr:strarr)
		{
			if(map.containsKey(arr))
			{
			map.put(arr, map.get(arr)+1);
			}else
			{
				map.put(arr, 1);

			}
			
		}
		
		for(Map.Entry<String, Integer> set:map.entrySet())
		{
			System.out.println("key:"+set.getKey()+"---"+"value:"+set.getValue());
		}

		
	}
	
	public static void reverseWord()
	{
		String str="Hellow How are you";
		String[] arr=str.split(" ");
		for(int i=1;i<arr.length;i++)
		{
			if(!arr[i].isEmpty())
			{
				
				for(int j=1;j<arr[i].length();)
				{
					
				}
			}
		}
	}
	
	public static void PreservewordReverse()
	{
		 String str="Hi guru balaji balaji guru hi guru";
	        String [] strarr=str.split(" ");
	       StringBuilder result=new StringBuilder();
	        for(String word:strarr)
	        {
	         result.append(new StringBuilder(word).reverse()).append(" ");
	            
	        }
	        System.out.print(result.toString().trim());
	        
	    
	}
	public static void pringNumbersOnlyInString()
	{
		String str="higUrubaLaji56hsfgw45wnvs54wtwwe552";
		StringBuilder result=new StringBuilder();
		for(char ch:str.toCharArray())
		if(Character.isDigit(ch))
		{
			result.append(ch);
			
		}
		System.out.println(result.toString().trim());
		
	}
	public static void printOnlyAlphabetsInString()
	{
		String str="higUrubaLaji56hsfgw45wnvs54wtwwe552";
		StringBuilder result=new StringBuilder();
		for(char ch:str.toCharArray())
		if(Character.isAlphabetic(ch))
		{
			result.append(ch);
			
		}
		
		System.out.println(result.toString().trim());
		
	}
	public static Boolean isPalindrome(String str){
		 
		int start=0;
		int end=str.length()-1;
		boolean b=false;
		for(int i=0;i<end;i++)
			if(str.charAt(start)!=str.charAt(end))
			{
				return b;
			}
		start++;
		end--;
		return true;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//letteerscountByMap();
		//letterscount();
		//countWords();
		//PreservewordReverse();
		//pringNumbersOnlyInString();
		//printOnlyAlphabetsInString();
		//isPalindrome("madam");
		
		
	}
		

}
