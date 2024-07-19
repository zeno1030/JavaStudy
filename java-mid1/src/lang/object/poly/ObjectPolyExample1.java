package lang.object.poly;

public class ObjectPolyExample1 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Car car = new Car();

		action(dog);
		action(car);
	}

	private static void action(Object obj) {
		// obj.move();	컴파일 오류, Object는 move()가 없다.
		// obj.sound(); 컴파일 오류, Object는 sound()가 없다.

		if (obj instanceof Dog dog) {
			dog.sound();
		} else if (obj instanceof Car car) {
			car.move();
		}
	}
}
