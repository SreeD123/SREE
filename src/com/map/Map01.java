package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
                 
public class Map01 {
public static void main(String[] args) {
	// Map is a Separated Interface                    
	//Syntax--> Map<Key,Value>refName = new TypesOfMap<Key,Value>();
    //Map methods--> put(),size(),get(),keySet(),values(),containsKey(),entrySet()

		Map<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(1, "sree");
		m.put(2, "deni");
		m.put(3, "ammu");
		m.put(4, "pika");
		m.put(5, "tom");
		System.out.println(m);
		             
		System.out.println(m.size());
        
		System.out.println(m.get(3));
		
		Set<Integer> k=m.keySet();
		System.out.println(k);
		
		Collection<String> c = m.values();
		System.out.println(c);
		
        Set<Entry<Integer,String>> d= m.entrySet();		
        System.out.println(d);
               	
}
}
