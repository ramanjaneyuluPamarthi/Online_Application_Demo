package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class ClassB
{
void meth1()
{
	System.out.println("implementing map interface");
	//HashMap<Object,object>Map=new Hashmap<Object,Object>();
	LinkedHashMap<Object,Object>map=new LinkedHashMap<Object,Object>();
	map.put(19,"java");
	map.put("java",18);
	map.put(null,null);
	map.put("hello",20);
	map.put(29,'a');
	map.put(19,"hi");
	map.put("java",100);
	map.put(19,"java");
	System.out.println(map);
	System.out.println("get():"+map.get(100));
	System.out.println("get():"+map.get(200));
	LinkedHashSet<Object>li=new LinkedHashSet<Object>(map.keySet());
	System.out.println("keys:"+li);
	for(Object O:li)
	{
		System.out.println(O+" "+map.get(O));
	}
	System.out.println("retriving the data from the map empty interface");
	ArrayList<Object>set=new ArrayList<Object>(map.entrySet());
	Iterator<Object>i=set.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
	public static void main(String[] args) {
		ClassB aobj=new ClassB()
;
		aobj.meth1();
	}

}
