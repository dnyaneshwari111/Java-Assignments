package mapdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String>map=new HashMap<>();
		map.put(1, "Java");
		map.put(2, "JavaScript");
		map.put(3, "Python");
		map.put(4, "C sharp");
		
		System.out.println(map);
		
	}

}
