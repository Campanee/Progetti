import java.lang.Math;
public class Matrix{

private double[][] m;
private int numberOfRows;
private int numberOfColumns;

	/**create a matrix with variable rows and columns and numbers 
	 * @param numberOfRows
	 * @param numberOfColumns
	 * @param m
	 */
	public Matrix(int numberOfRows, int numberOfColumns, double[][]m){
		this.numberOfRows=numberOfRows;
		this.numberOfColumns=numberOfColumns;
		m = new double[numberOfRows][numberOfColumns];
		this.m=m;
	}
	/**
	 * create an empty matrix with fixed dimensions
	 */
	public Matrix() {
		numberOfRows=3;
		numberOfColumns=3;
		m = new double [numberOfRows][numberOfColumns];
	}
	
	/**
	 * set the content of the matrix to 0
	 */
	public void setZero() {
		for(int i=0;i<numberOfRows;i++) {
			for(int j=0;j<numberOfColumns;j++) {
            	m[i][j] = 0;
			}
		}
	}
	
	/**
	 * set the content of the matrix to 1
	 */	
	public void setOne() {
		for(int i=0;i<numberOfRows;i++) {
			for(int j=0;j<numberOfColumns;j++) {
            	m[i][j] = 1;
			}
		}
	}

	/**
	 * set the content of the matrix to an input value (nN)
	 * @param nN
	 */
	public void setToN(double nN) {
		for(int i=0;i<numberOfRows;i++) {
			for(int j=0;j<numberOfColumns;j++) {
            	m[i][j] = nN;
			}
		}
	}
	
	
	/**
	 * set the content of the matrix to random values.
	 */
	public void random() {
		for(int i=0;i<numberOfRows;i++) {
			for(int j=0;j<numberOfColumns;j++) {
				m[i][j]= Math.random() * 20;  
			}
		}
	}

	/**
	 * return the minimum value of the matrix
	 */
	public double min() {
		double min = m[0][0];
		for (int i = 0; i < numberOfRows; i++) {
			for(int j = 0; j < numberOfColumns; j++) {
				if(m[i][j] < min) {
					min = m[i][j];
				}
			}
		}
		return min;
	}

	/**
	 * return the maximum value of the matrix
	 */	
	public double max() {
		double max = m[0][0];
		for (int i = 0; i < numberOfRows; i++) {
			for(int j = 0; j < numberOfColumns; j++) {
				if(m[i][j] > max) {
					max = m[i][j];
				}
			}
		}
		return max;
	}
	
	/**
	 * return the average value of the matrix
	 */
	public double average() {
		double sum = 0, average;
		for(int i=0;i<numberOfRows;i++){ 
			for(int j=0;j<numberOfColumns;j++){ 
				sum = sum + m[i][j];
			}
		}
		return average = sum/(numberOfRows*numberOfColumns);
	}
	
	/**
	 * return the sum result of a row in the matrix
	 * @param Row
	 */
	public double sumRow(int Row) {
		double sum = 0;
		for(int i=0;i<numberOfColumns;i++){ 
				sum = sum + m[Row][i];
		}
		return sum;
	}

	/**
	 * return the sum result of a column in the matrix
	 * @param Column
	 */	
	public double sumColumn(int Column) {
		double sum = 0;
		for(int i=0;i<numberOfRows;i++){ 
				sum = sum + m[i][Column];
		}
		return sum;
	}
	
	/**
	 * return the multiplication result of a row in the matrix
	 * @param Row
	 */
	public double mulRow(int Row) {
		double mul = 1;
		for(int i=0;i<numberOfColumns;i++){ 
				mul = mul * m[Row][i];
		}
		return mul;
	}
	
	/**
	 * return the multiplication result of a column in the matrix
	 * @param Column
	 */
	public double mulColumn(int Column) {
		double mul  = 1;
		for(int i=0;i<numberOfRows;i++){ 
				mul = mul * m[i][Column];
		}
		return mul;
	}
	
	/**
	 * return the position of the first found occurrence of specified parameter value
	 * @param number
	 */
	public int[] indexOf(double number) {
		int row=-1, col=-1;
		for(int i=0;i<numberOfRows;i++){ 
			for(int j=0;j<numberOfColumns;j++){ 
				if(number == m[i][j]) {
					row = i;
					col = j;
				}
			}
		}
		return new int[] {row, col};
	}
	
	/**
	 * count the times a number is in the matrix and return this value
	 * @param number
	 */
	public int numberOf(double number) {
		int cont=0;
		for(int i=0;i<numberOfRows;i++){ 
			for(int j=0;j<numberOfColumns;j++){ 
				if(number == m[i][j]) {
					cont = cont + 1;
				}
			}
		}
		return cont;
	}
	
	
	/**
	 * return the average value of a column in the matrix
	 * @param Column
	 */
	public double aveCol(int Column) {
		double sum = 0, average;
		for(int i=0;i<numberOfRows;i++){ 
				sum = sum + m[i][Column];
		}
		return average = sum/numberOfColumns;
	}
	
	/**
	 * return the average value of a row in the matrix
	 * @param Row
	 */
	public double aveRo(int Row) {
		double sum = 0, average;
		for(int i=0;i<numberOfColumns;i++){ 
				sum = sum + m[Row][i];
		}
		return average = sum/numberOfRows;
	}
	
	/**
	 * return the number of Rows
	 */
	public int getRows(){
		return numberOfRows;
	}

	/**
	 * return the number of Columns
	 */
	public int getColumns(){
		return numberOfColumns;
	}

	/**
	 * print the matrix
	 */
	public void getMatrix(){
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfColumns; j++) {
				System.out.print(m[i][j]+" ");
			}
		}
	}

	/**
	 * set an element in a specific location of the matrix (row, column)
	 * @param value 
	 * @param i
	 * @param j
	 */
	public void assignElement(double value, int i, int j){
		m[i][j] = value;
	}

	/**
	 * return a string that contains the matrix
	 */
	public String toString(){
		String es = new String();
    	for(int i = 0; i < numberOfRows; i++){
            	for(int j = 0; j < numberOfColumns; j++){
                    es += "[";
                    es += m[i][j];
                    es += "]";
            	}
    	}
    	return es;
	}
	
	/**
	 * set the matrix with values taken from another matrix
	 * @param m
	 */
	public void setMatrice(double[][] m) {
		this.m = m;
	}

}