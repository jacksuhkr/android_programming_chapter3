package sec06.exercise07_generics;

import java.util.ArrayList;

public class Generics {
	public static void main(String args[]) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(2);
//		numList.add("3");		//generics <Integer>�� �߰��߱� ������ ������ "3"�� ������ ������ ������ �߻���
		numList.add(3);
		
		int hap=0;
		for(int i=0; i< numList.size(); i++) {
			hap += (int) numList.get(i);
		}
		System.out.print( hap );
	}
}
