package EstudioMatrices;

public class Arrays_bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = new int[2][3];
		
		matrix[0][0]= 15;
		matrix[0][1]= 21;
		matrix[0][2]= 18;

		matrix[1][0]= 10;
		matrix[1][1]= 52;
		matrix[1][2]= 19;
		
		for (int i=0; i<2;i++) {
			for(int j=0;j<3;j++) {
		
		System.out.println(matrix[i][j]);

	  }
    }
  }
}