package lang.clazz;

import java.lang.reflect.Field;

public class ClassMetaMain {
	public static void main(String[] args) throws ClassNotFoundException {
		//Class 조회
		Class stringClass = String.class;
		// Class clazz1 = new String().getClass();
		// Class clazz2 = Class.forName("java.lang.String");

		//모든 필드를 출력할 수 있다.
		Field[] fields = stringClass.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}

		//인터페이스 정보 출력
		Class[] interfaces = stringClass.getInterfaces();
		for (Class anInterface : interfaces) {
			System.out.println("anInterface = " + anInterface);
		}
	}
}
