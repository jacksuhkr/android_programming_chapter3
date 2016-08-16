package sec06.exercise06_inherit;

public class Truck extends Car {
	int cc;
	static final int YEAR = 2013;
	
	Truck(int cc) {
		this.cc = cc;
	}
	
	int getCC(Truck truck) {
		return truck.cc;
	}
	
	@Override
	public void upSpeed(int value) {
		if (speed + value >= 150)
			speed = 150;
		else
			speed = speed + value;
	}
}
