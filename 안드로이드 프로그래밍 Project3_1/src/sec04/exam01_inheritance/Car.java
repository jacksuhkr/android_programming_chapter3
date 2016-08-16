package sec04.exam01_inheritance;

public class Car {
	String color;
	int speed;
	
	Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	Car(int speed) {
		this.speed = speed;
	}
	
	Car() {
	}
	
	int getSpeed() {
		return speed;
	}
	
	void upSpeed(int value) {
		if (speed + value >= 200)
			speed = 200;
		else
			speed = speed + value;
	}
	
	void downSpeed(int value) {
		if (speed - value <= 0) 
			speed = 0;
		else
			speed = speed - value;
	}
	
	String getColor() {
		return color;
	}
}
