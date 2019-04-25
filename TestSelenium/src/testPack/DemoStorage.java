package testPack;

import java.util.HashSet;

public class DemoStorage {

	public static void main(String[] args) {
	String[] a={"test", "test",""};
	System.out.println(a.length);

	HashSet<String> b=new HashSet();
	b.add("test");
	b.add("testing");
	b.add("test");
	System.out.println(b.size());
	}

}
