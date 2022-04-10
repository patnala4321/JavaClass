package maps;

import java.util.*;

public class MapsEx1 {

	public static void main(String[] args) {
		Map m1 = new HashMap();

		Map m2 = new TreeMap();

		Map m3 = new LinkedHashMap();

		Map m4 = new Hashtable();

		m1.put(11, "AAAA");
		m1.put(2, "BBBB");
		m1.put(4, "CCCC");
		m1.put(3, "DDDD");
		m1.put(5, "DDbb");
		m1.put(3, "DDDD");
		m1.put(9, "DDbb");
		m1.put(10, "DDbb");
		m1.put(50, "IIII");
		m1.put(25, "xxxxx");

		Set set = m1.entrySet();

		Iterator itr = set.iterator();

		System.out.println("Hash  Map");
		while (itr.hasNext()) {

			Map.Entry entry = (Map.Entry) itr.next();

			System.out.println(entry.getKey() + "    " + entry.getValue());
		}

		System.out.println("Hash  Map Traversal using for..each loop");
//
//		for (Map.Entry m : m1.entrySet()) {
//			System.out.println(m.getKey() + " " + m.getValue());
//		}
//
//		System.out.println("Hash  Map Traversal using for..each loop");
//
//		for (Map.Entry<Object> m : m1.entrySet()) {
//			System.out.println(m.getKey() + " " + m.getValue());
//		}

		m1.put(11, "AAAA");
		m2.put(1, "AAAA");
		m2.put(2, "BBBB");
		m2.put(4, "DDDD");
		m2.put(3, "CCCC");
		m2.put(3, "DDDD");
		m2.put(9, "DDbb");
		m2.put(10, "DDbb");
		m2.put(50, "IIII");
		m2.put(25, "xxxxx");

		set = m2.entrySet();

		itr = set.iterator();

		System.out.println("Tree Map ");
		while (itr.hasNext()) {

			Map.Entry entry = (Map.Entry) itr.next();

			System.out.println(entry.getKey() + "    " + entry.getValue());
		}

		m3.put(11, "AAAA");
		m3.put(2, "BBBB");
		m3.put(4, "CCCC");
		m3.put(3, "DDDD");
		m3.put(5, "DDbb");
		m3.put(3, "DDDD");
		m3.put(9, "DDbb");
		m3.put(10, "DDbb");
		m3.put(50, "IIII");
		m3.put(25, "xxxxx");

		set = m3.entrySet();

		itr = set.iterator();

		System.out.println("Linked HashMap");

		while (itr.hasNext()) {

			Map.Entry mp = (Map.Entry) itr.next();

			System.out.println(mp.getKey() + "    " + mp.getValue());

		}

		m4.put(11, "AAAA");
		m4.put(2, "BBBB");
		m4.put(4, "CCCC");
		m4.put(3, "DDDD");
		m4.put(5, "DDbb");
		m4.put(3, "DDDD");
		m4.put(9, "DDbb");
		m4.put(10, "DDbb");
		m4.put(50, "IIII");
		m4.put(25, "xxxxx");

		set = m4.entrySet();

		itr = set.iterator();

		System.out.println("Hashtable");

		while (itr.hasNext()) {

			Map.Entry mp = (Map.Entry) itr.next();

			System.out.println(mp.getKey() + "    " + mp.getValue());

		}

	}

}
