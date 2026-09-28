package mapdemo;

import java.util.HashMap;
import java.util.Map;

public class OccuranceCount {

	public static void main(String[] args) {
		
		String s="COCACOLA";
		Map<Character,Integer>map=new HashMap<>();
		for(int i=0;i<s.length();i++) 
		{
			char ch=s.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
			
		}
		System.out.println("Occurance of Elements : "+ map);
	}

}
