package tekstbestand;

public class Programma2Matrix {
	private int matrix[][]; // Empty 2D matrix with integer values
	
	// Default constructor
	public Programma2Matrix() {
		/* Indices start at 0, so cols: 0,1,2,3,4 */
		matrix = new int[2][5]; // Two rows, five columns
		
	}
	
	// Getter to access the private attributes
	public int[][] getMatrix() {
		return this.matrix;
	}
	
	// Setter to access the private attributes
	public void setMatrix(int row, int col, int getal){
		this.matrix[row][col] = getal;
	}
	
	// Print method to correctly print the matrix
	public void printMatrx() {
		// Using two nested for-loops
		for(int i = 0; i < this.matrix.length; i++) {
			for(int j = 0; j < this.matrix[i].length; j++) {
				System.out.print(this.matrix[i][j] + "\t"); // Inserting a tab = "\t"
			}
			System.out.println(); // White line between two rows
		}
	}
}
