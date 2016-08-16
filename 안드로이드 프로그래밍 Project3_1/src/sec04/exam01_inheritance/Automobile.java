package sec04.exam01_inheritance;

public class Automobile extends Car {
	int seatNum;
	
	int getSeatNum() {
		return seatNum;
	}
	
	Automobile() {
		super();
	}
	
	@Override
	void upSpeed(int value) {
		if (speed + value >= 300)
			speed = 300;
		else
			speed = speed + (int) value;
	}
}
