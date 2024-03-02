package ch12.sec11.exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class RelectionExample {

	public static void main(String[] args) {
		
		Class clazz = Car.class;
		
		// Car의 생성자와 생성자의 매개변수 출력.
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getConstructors();
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		
		System.out.println();

		// Car의 필드 정보 출력
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getName() + " " + field.getName());
		}
		
		// Car의 메소드 정보 출력
		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.print(method.getName()+ "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}

	private static void printParameters(Class[] parameters) {
		for(int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if(i < parameters.length-1){
				System.out.print(",");
			}
		}
	}
}
