package programcreek.reflection;

import java.lang.reflect.Method;
 
public class GetClassName {
	public static void main(String[] args){
		Foo2 f = new Foo2();
		System.out.println(f.getClass().getName());			
	}
}
 
class Foo2 {
	public void print() {
		System.out.println("abc");
	}
}
