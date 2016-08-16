package sec06.exercise04_array;

public class Array {
	public static void main(String args[]) {
		int array[][] = new int[3][3];
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = 100 + 10 * (i*3 + j);
				System.out.println("array[" + i + "][" + j + "] : " + array[i][j]);
			}
		}
	}
}
