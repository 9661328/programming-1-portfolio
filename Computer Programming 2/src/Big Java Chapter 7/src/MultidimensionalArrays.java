import java.util.*;

public class MultidimensionalArrays {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int size = scanner.nextInt();
	
	if (size <= 1000) {
	int[][] table = new int[size][size];
	
	
	for (int row = 0; row < size; row++) {
	    for (int column = 0; column < size; column++) {
		table[row][column] = (row + 1) * (column + 1);
	    }
	}
	
	
	for (int[] column: table) {
	    for (int num: column) {
		System.out.printf("%7d", num);
	    }
	    System.out.println();
	}
	
	scanner.close();
	}
    }
}
