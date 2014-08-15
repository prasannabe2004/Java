package programcreek.reflection;

import java.lang.reflect.Method;
 
 
public class InvokeMethod {
	public static void main(String[] args){
		Foo4 f = new Foo4();
 
		Method method;
		try {
			method = f.getClass().getMethod("print", new Class<?>[0]);
			method.invoke(f);
		} catch (Exception e) {
			e.printStackTrace();
		}			
	}
}
 
class Foo4 {
	public void print() {
		System.out.println("abc");
	}
}

