package sec06.exercise03_switch;

public class Switch {
	public static void main(String arg[]) {
		int input = 85;
		int jumsu = (input / 10) * 10;
		
		switch(jumsu) {
		case 100:
		case 90: System.out.println("A ����"); break;
		case 80: System.out.println("B ����"); break;
		case 70: System.out.println("C ����"); break;
		case 60: System.out.println("D ����"); break;
		default: System.out.println("F ����");
		}
	}
}
